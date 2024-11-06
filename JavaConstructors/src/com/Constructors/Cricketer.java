package com.Constructors;

public class Cricketer {

	int cId;
	String cName;
	int countryCode;
	String countryName;

//	Parameterized constructor
	Cricketer(int cId, String cName, int countryCode, String countryName) {

		this.cId = cId;
		this.cName = cName;
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

// No Arg constructor
	Cricketer() {

	}

	public static void main(String[] args) {

		Cricketer c = new Cricketer(18, "Virat Kohli", 91, "India");

		System.out.println(c.cId);
		System.out.println(c.cName);
		System.out.println(c.countryCode);
		System.out.println(c.countryName);
		
//      We should create no arg constructor to create an object after
//		creating parameterized constructor
		
		Cricketer c1 = new Cricketer();
		c1.cId = 45;
		c1.cName = "Rohit Sharma";
		c1.countryCode = 91;
		c1.countryName = "India";
		System.out.println(c1.cId);
		System.out.println(c1.cName);
		System.out.println(c1.countryCode);
		System.out.println(c1.countryName);

	}

}
