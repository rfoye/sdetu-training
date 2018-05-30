package oop;

public class Demo {

	public static void main(String[] args) {
		// Person
		// Instantiate an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "joe";
		person1.email = "joe@testemail.com";
		person1.phone = "1234567899";
		
		// Abstraction (get properties & methods we want.
		person1.walk();
		person1.sleep();
		person1.eat();

		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		// attributes, variables, adjectives, descriptors
//		String name = "Joe";
//		String email = "joe@testemail.com";
//		String phone = "1234567899";
//		
//		// action, activity, behavior
//		//System.out.println(name + " is walking");
//		walking(name);
//		System.out.println(name + " is eating");
//		
//		//what if we wanted to do this for another person?
//		String name2 = "Sarah";
//		String email2 = "sarah@testemail.com";
//		String phone2 = "2051222445";
//		
//		// action, activity, behavior
//		//System.out.println(name2 + " is walking");
//		walking(name2);
//		System.out.println(name2 + " is eating");
//		
//		// what about binding attributes and properties together?
//		

	}
//	
//	//Enhance by adding functions to minimize code
//	static void walking(String name) {
//		System.out.println(name + " is walking.");
//	}

		
}

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}