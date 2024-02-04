package com.app.core;

import java.time.LocalDate;

public class Vehicle  implements Comparable<Vehicle>{
     private String chasisNo;
     private Color vehColor;
     private double basePrice;
     private LocalDate manufactureDate ;
     private String  company;
     private boolean available;
     
     public Vehicle() {
    	 
     }
	 public Vehicle(String chasisNo,Color vehColor, double basePrice, LocalDate manufactureDate, String company) {
		//super();
		this.chasisNo = chasisNo;
		this.vehColor = vehColor;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.available = true;
	}
	 
	//overloaded constructor to wrap chasisNo
	 public Vehicle(String chNo) {
		 super();
		 this.chasisNo =chNo;
	 }
     
	 
	 public String getChasisNo() {
		 return this.chasisNo;
	 }
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehColor="+vehColor+",  basePrice = "+(basePrice+vehColor.getAdditionalCost())+", manufactureDate=" + manufactureDate
				+ ", company=" + company + ", available=" + available + "]";
	}
	 
	@Override
	public boolean equals(Object o) {  //signature of equals method in Object class and it should be same in our class too.
		if(o instanceof Vehicle) {
              Vehicle v = (Vehicle)o;
              return this.chasisNo.equals(v.getChasisNo());
		}
		return false;
	}
	
	@Override
	public int compareTo(Vehicle v) { //  signature in comparable interface is
		                               // public int compareTo(T o) /// generic type
		
		return this.getChasisNo().compareTo(v.chasisNo);
	}
	public Color getVehColor() {
		return vehColor;
	}
	public void setVehColor(Color vehColor) {
		this.vehColor = vehColor;
	}
	
	
     
     
     
}
