package com.core;

public enum Type {
    SAVING(10000),CURRENT(5000),FD(5000);
    
    public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	private int minBalance;
	
	private Type (int minBalance){
		//super(name,ordinal)
		this.minBalance = minBalance ;
	}
	
	
	
}
