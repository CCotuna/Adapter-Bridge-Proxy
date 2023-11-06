package com.proxy;

// Real object - Cash
public class Cash implements Payment {

	@Override
	public void makePayment(int amount) {
		System.out.println("Paid RON" + amount + " in cash.");
	}

}
