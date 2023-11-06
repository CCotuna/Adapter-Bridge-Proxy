package com.proxy;

public class MainProxy {

	public static void main(String[] args) {
		Payment creditCard = new CreditCard();
		creditCard.makePayment(100);
	}

}
