package com.Constructors;

public class PracticeConstructors {

	int number;
	String name;
	long phone;
	int batch;

	PracticeConstructors(int number, String name, long phone, int batch) {
           number = number;
           name = name;
           phone = phone;
           batch = batch;
	}
	PracticeConstructors(){
		
	}

	public static void main(String[] args) {
     
	 PracticeConstructors p = new PracticeConstructors(345,"Hi",983454,53);
		
		System.out.println(p.number);
		System.out.println(p.name);
		System.out.println(p.phone);
		System.out.println(p.batch);
	}

}
