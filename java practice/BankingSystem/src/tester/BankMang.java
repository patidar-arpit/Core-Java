package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import utility.BankUtility;

import com.core.BankAccount;
import com.core.Type;

import Validation.BankValiadtion;

public class BankMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		HashMap<String, BankAccount> hs = BankUtility.sampleData();
		
		while (true) {
			System.out.println("1.Open new Account");
			System.out.println("2.Get  Account Summary");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.TransferFunds");
			System.out.println("6.Close Account");

			System.out.println("Enter Choice:");
			try {
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter AcctNo:");
					int acctNo = BankValiadtion.checkValidateAcctNo(scanner.nextInt(),hs);
//int acctNo, String name, Type acctType, int balance, LocalDate creationDate,
					//LocalDate lastTxDate					
					System.out.println("Enter details:(name,AccountType,balance,creationDate");
					BankAccount bankAccount  = BankValiadtion.giveAll(acctNo,scanner.next(),scanner.next(),scanner.nextInt(),scanner.next());
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
