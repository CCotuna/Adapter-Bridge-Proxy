package com.adapter;

public class School {

	public static void main(String[] args) {
		
		Pen p = new PenAdapter();
		Assignment aw = new Assignment();
		aw.setP(p);
		aw.writeAssignment("I'm done");
	}

}
