package com.core;

import java.time.LocalDate;

public class BankAccount {
	
	private int acctNo;
	private String name;
	private Type  acctType;
	private int balance;
	private LocalDate creationDate;
	private LocalDate lastTxDate;
	private boolean actice;
	
	
	public BankAccount(int acctNo, String name, Type acctType, int balance, LocalDate creationDate) {
		this.acctNo = acctNo;
		this.name = name;
		this.acctType = acctType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastTxDate = creationDate;
		this.actice = true;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", name=" + name + ", acctType=" + acctType + ", balance=" + balance
				+ ", creationDate=" + creationDate + ", lastTxDate=" + lastTxDate + ", actice=" + actice + "]";
	}
	
	
	public void withdraw() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getAcctType() {
		return acctType;
	}
	public void setAcctType(Type acctType) {
		this.acctType = acctType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getLastTxDate() {
		return lastTxDate;
	}
	public void setLastTxDate(LocalDate lastTxDate) {
		this.lastTxDate = lastTxDate;
	}
	public boolean isActice() {
		return actice;
	}
	public void setActice(boolean actice) {
		this.actice = actice;
	}
	

}
