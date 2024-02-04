package Validation;

import java.time.LocalDate;
import java.util.HashMap;

import com.core.BankAccount;
import com.core.Type;

import BankingException.BankException;

public class BankValiadtion {
	
	public static int checkValidateAcctNo(int acctNo,HashMap<String, BankAccount> hs) throws BankException {
		// TODO Auto-generated method stub
		if(hs.containsKey(acctNo))
		  throw new BankException("Acctno Already Exists");
		
		return acctNo;
	}

	public static BankAccount giveAll(int acctNo, String name, String type, int price, String date) {
		// TODO Auto-generated method stub
		Type t = validateType(type);
		LocalDate d = validaDate(date);
		return new BankAccount(acctNo, name, t, price, d);
	}

	private static LocalDate validaDate(String date) {
		// TODO Auto-generated method stub
		return LocalDate.parse(date);
	}

	private static Type validateType(String type) {
		// TODO Auto-generated method stub
		return Type.valueOf(type);
	}
	

}
