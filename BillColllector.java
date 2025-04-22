package com.programm;

public class BillColllector {

	private IPayment payment;// reference variable create
	
	public void setPayment(IPayment payment) {  // setter Injection
		this.payment=payment;
		
	}

	public BillColllector() {       //constroctor Injection
		
	}
	public BillColllector(IPayment payment) {
		this.payment=payment;
	}
	
	public void collectPayment(double amount) {
		String status=payment.pay(amount);
		System.out.println(status);
	}

}
