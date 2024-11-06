package com.Constructors;

public class Student {

	int age;
	String name;
	long phone;

	Student(int age, String name, long phone) {
        this.age = age;
         this.name = name;
         this.phone = phone;
         
	}
	Student(){
		
	}

	public static void main(String[] args) {
		Student s = new Student(21,"Sravani",97348676L);
//		s.age = 21;
//		s.name = "Sravani";
//		s.phone = 9963282805l;
		
//		Student s1 = new Student();
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.phone);
//		System.out.println(s1.age);
//		System.out.println(s1.name);
//		System.out.println(s1.phone);
		
	}

}
