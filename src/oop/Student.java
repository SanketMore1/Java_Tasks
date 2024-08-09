package oop;

public class Student {

	String name ;   // null
	String college;  //null
	String degree;  // null
	int id;    // 0
	int age;  // 0
	boolean ispresent;  // false
	// constructor
	
	// constructor is used to intialize object / or to provide default values
	
	// # no return type
	// # constructor should have same name as class name
	
	// #1. default constructor
	Student(){
		
		
	}
//	
//	// #2. Parameterized constructor
   Student(String name,String college,String degree,int id,int age,boolean ispresent){
		this.name=name;
		this.college =college;
		this.id=id;
		this.degree = degree;
		this.age= age;
		this.ispresent = ispresent;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		// Person 
		// name , age , height, weight ,location 
		
		// Student
		// name,college, degree, id/roll no
		
		// Laptop
		// Brand, Specification{ram, generation, processor,graphics card}
		
		// Employee
		// name, id, company, salary,city
		
		// class is logical diagram for any real world entity
		
		// Object
		// object is an instance of class
		
		//int a =10;
		
		// object creation
		Student student1 = new Student("Ram","MIT","B.E",1,21,true);
		
		
	 
		System.out.println("Name of Student : "+ student1.name); 
		System.out.println("Name of college : "+student1.college);
		System.out.println("Name of degree : "+student1.degree);
		System.out.println("Student ID : "+student1.id);
		System.out.println("Student Age : "+student1.age);
		System.out.println("Is present : "+student1.ispresent);
		
	}

}
