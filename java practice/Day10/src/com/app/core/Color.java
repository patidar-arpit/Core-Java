package com.app.core;

public enum Color {
   
	WHITE(5000),BLACK(10000),GREY(7000),SILVER(6000);
	
	private int additionalCost;
	private Color(int additionalCost) {
		//super(name(),ordinal());
		this.additionalCost = additionalCost;
	}
	
	public void setAdditionalCost(int additionalCost) {
		this.additionalCost = additionalCost;
	}
	
	public int getAdditionalCost() {
		return this.additionalCost;
	}
	
	@Override
	public String toString() {
		return name()+": AdditionalCost:"+this.additionalCost;
	}
	
}
