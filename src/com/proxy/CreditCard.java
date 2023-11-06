package com.proxy;

//Proxy for credit card
public class CreditCard implements Payment{

	private BankAccount bankAccount;
	
	public CreditCard() {
		this.bankAccount = new BankAccount();
	}

	@Override
	public void makePayment(int amount) {
		System.out.println("Paid RON" + amount + " using credit card.");
		bankAccount.makePayment(amount);
	}
	

}
