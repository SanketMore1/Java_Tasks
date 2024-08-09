package practical_practice;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import practical_practice.Student; 
public class Executor {
	
static 	List<Student> students = new ArrayList<>();

	// CRUD 
	   //         107     Laxman     20


void read() {
//	for (Student s : students) {
//		
//		System.out.println(s);
//		
//	}
	
//	
//ListIterator<Student> itr = students.listIterator();
//	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	
	//students.stream().forEach(ss -> System.out.println(ss));
	
	
//	students.parallelStream().forEach(ss -> System.out.println(ss));

}


// ramrao
 void update(long id,String name,int age) {
		boolean flag = false;
		for(int i=0;i<students.size();i++) {
			
			
			// 104   
			if(id== students.get(i).getId()) {
				students.get(i).setName(name);
				students.get(i).setAge(age);
				System.out.println("Student data updated successfully !");
				flag = true;
			
			}
		}
		
		if(flag == false) {
		System.out.println("Student is not present in database");
		}
	}
	
	
	void delete(long id) {
		boolean flag = false;
		for(int i=0;i<students.size();i++) {
			if(id==students.get(i).getId()) {
				students.remove(i);
				System.out.println("Student data removed Successfully.");
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("Student not exists in database.");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Ram",21,"12th");    // Ramrao
		Student s2 = new Student(102,"Shyam",22,"11th"); 
		Student s3 = new Student(103,"Krishna",23,"10th");
		Student s4 = new Student(104,"Laxman",21,"11th");
		Student s5 = new Student(105,"Bharat",27,"11th");  // bharat >> INDIA  28
		Student s6 = new Student(106,"Hanuman",19,"12th");
		
	// s4  then Laxman DOB certificate 21 => 20
		// book     
		
		// students name /  age  / class / standard
		// Laxman           20     11th
		
		
		
		
//	
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);
	students.add(s5);
	students.add(s6);
	
//	for(int i=0;i<students.size();i++) {
//		System.out.println(students.get(i).toString());
//	}
//	
//	int a =10;
//	

//	
		Executor e = new Executor();
	//e.update(105, "INDIA", 28);
	//e.delete(107);
	e.read();
		
		//System.out.println(s4.getAge());
		
	
	
	
	
	
	}

}
