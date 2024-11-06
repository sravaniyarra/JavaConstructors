package com.Constructors;

public class PracticeConstructors2 {

	int number;
	String name;
	long phone;
	int batch;

	PracticeConstructors2(int number, String name, long phone, int batch) {
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.batch = batch;
	}

	PracticeConstructors2() {
        System.out.println("This is an No arg Constructor");
	}

	public static void main(String[] args) {

		PracticeConstructors2 p1 = new PracticeConstructors2();
		PracticeConstructors2 p = new PracticeConstructors2(345, "Hi", 983454, 53);

		System.out.println(p.number);
		System.out.println(p.name);
		System.out.println(p.phone);
		System.out.println(p.batch);
		
		
	}

}
