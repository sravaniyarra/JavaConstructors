package com.Constructors;

public class Person {

	int id;
	String name;
	int age;
	double salary;
	
	Person(){
		this(79);
		
		System.out.println("No arg Constructor");
	}
	Person(int id){
		this(80,"Sravani");
		this.id = id;
		System.out.println("One arg Constructor");
	}
	Person(int id,String name){
		this("Sowmya",22,23.0);
		System.out.println("Two arg Constructor");	
	}
    Person( String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		
		
		Person p = new Person();
//		Person p1 = new Person();
		
		System.out.println(p.age);
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.salary);
		

	}

}
