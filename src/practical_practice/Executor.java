package practical_practice;
import java.util.ArrayList;
import java.util.List;

import practical_practice.Student; 
public class Executor {
	
static 	List<Student> students = new ArrayList<>();

	
	
 void update(long id,String name,int age) {
		
		for(int i=0;i<students.size();i++) {
			if(id== students.get(i).getId()) {
				System.out.println("we got him");
			}else {
				System.out.println("No");
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Ram",21,"12th");
		Student s2 = new Student(102,"Shyam",22,"11th");
		Student s3 = new Student(103,"Krishna",23,"10th");
		Student s4 = new Student(104,"Laxman",21,"11th");
		Student s5 = new Student(105,"Bharat",27,"11th");
		Student s6 = new Student(106,"Hanuman",19,"12th");
		
	// s4  then Laxman DOB certificate 21 => 20
		// book     
		
		// students name /  age  / class / standard
		// Laxman           20     11th
		
		
		
		
//	
//	students.add(s1);
//	students.add(s2);
//	students.add(s3);
//	students.add(s4);
//	students.add(s5);
//	students.add(s6);
	
//	for(int i=0;i<students.size();i++) {
//		System.out.println(students.get(i).toString());
//	}
//	
//	int a =10;
//	
//	for (Student s : students) {
//		
//		System.out.println(s);
//		
//	}
//	
		Executor e = new Executor();
	e.update(104, "Laxman", 20);
		
		//System.out.println(s4.getAge());
		
	
	
	
	
	
	}

}
