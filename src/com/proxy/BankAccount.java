package com.proxy;

//Proxy for Bank Account
public class BankAccount implements Payment {

	private Cash cash;
	
	public BankAccount() {
		this.cash = new Cash();
	}

	@Override
	public void makePayment(int amount) {
		System.out.println("Paid RON " + amount + " using bank account.");
		cash.makePayment(amount);
	}

}
