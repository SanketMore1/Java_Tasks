package Practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Executor {
	
	static List<Employee> emp = new ArrayList<>();

	List<Employee> getEmployee(String department) {

		List<Employee> result = new ArrayList<>();

		// to get employee having any department

		boolean flag = false;
		for (Employee e : emp) {

			if (e.getDepartment() == department) {
				System.out.println(e.getName());
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("No employee there with given department");
		}

		return result;
	}
	
	
	static void search_Name(String ch) {
		for (Employee e : emp) {

			if (e.getName().contains(ch )|| e.getName().contains(ch )) {
				System.out.println(e.getName());
				
			}
		}
	}
	

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Sanket", "HR", 200000);
		Employee e2 = new Employee(2, "Ram", "IT", 200000);
		Employee e3 = new Employee(3, "Shyam", "tester", 200000);
		Employee e4 = new Employee(4, "Krishna", "manager", 200000);
		Employee e5 = new Employee(5, "Laxman", "tester", 200000);
		Employee e6 = new Employee(6, "Hanuman", "developer", 200000);
		Employee e7 = new Employee(7, "Arjun", "developer", 200000);
		Employee e8 = new Employee(8, "Karn", "tester", 200000);
		Employee e9 = new Employee(9, "Agastya", "tester", 200000);

//		for(int i=1;i<=9;i++) {
//			str=str+"1";
//			emp.add(str);
//			str="e";
//		}

		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);

		// to get all employees
		for (Employee e : emp) {
			System.out.println(e);
		}

//		// to get employee having department as manager
//boolean flag = false;
//		for (Employee e : emp) {
//
//			if (e.getDepartment() == "manager") {
//				System.out.println(e.getName());
//				flag = true;
//			} 
//		}
//		if (flag == false) {
//			System.out.println("No employee there with given department");
//		}

		// to increase salary of testers by 20%
		boolean flag = false;
		for (Employee e : emp) {

			if (e.getDepartment() == "tester") {
				int salary = e.getSalary() + (e.getSalary() / 5);
				e.setSalary(salary);
				System.out.println("Salary updated successfully");
				flag = true;
			} 	
		}if (flag == false) {
			System.out.println("No employee there with given department");
		}
		
		Executor.search_Name("s");
		
		Collections.sort(emp, new NameComparator());
		
	List<String> str = new ArrayList<String>();
	
	str.add("Ram");
	str.add("Shyam");
	str.add("Balram");
	str.add("Laxman");
	
	ListIterator<String> itr = str.listIterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	str.stream().forEach(ss -> System.out.println(ss));
	
	
	str.parallelStream().forEach(ss -> System.out.println(ss));

	}

}
