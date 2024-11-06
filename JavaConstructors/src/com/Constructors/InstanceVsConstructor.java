package com.Constructors;

public class InstanceVsConstructor {
	
	int age;
	String name;
	long phone;
	
	
	{
		System.out.println("Instance Block1");
	}
	InstanceVsConstructor(int age, String name, long phone) {
		this.age = age;
		this.name = name;
		this.phone = phone;
	}

	InstanceVsConstructor(){
		System.out.println("No arg constructor");
	}
	
	
	
	{  
		System.out.println("Instance Block2");
	}
	
	public static void main(String[] args) {
		InstanceVsConstructor ic = new InstanceVsConstructor();
		InstanceVsConstructor ic1 = new InstanceVsConstructor(21,"Sravani",9963282805l);
		InstanceVsConstructor ic4 = new InstanceVsConstructor();
		
		InstanceVsConstructor ic3 = new InstanceVsConstructor(22,"Sriranjani",996282805l);
		
		System.out.println(ic1.age);
		System.out.println(ic1.name);
		System.out.println(ic1.phone);
		

	}

}
