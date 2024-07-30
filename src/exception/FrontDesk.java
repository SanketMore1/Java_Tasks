package exception;


import java.util.ArrayList;

public class FrontDesk extends Employee {
	static ArrayList<Employee> Frontdesk_staff = new ArrayList<Employee>();

	public FrontDesk(int id, String name, int salary, int age) {
		super(id, name, salary, age);
		// TODO Auto-generated constructor stub
	}

	FrontDesk(){
		
	}
	
	int salary = 10000;

	int getSalary() {
		return salary;
	}

	void checkInGuests() {
		System.out.println("Guests checked in !");
	}

	
	
	
	void add(Employee emp) throws Duplicate_Employee {
		boolean flag = false;
		for (Employee employee : Frontdesk_staff) {
			if(emp.getId()== employee.id) {
				flag = true;
				throw new Duplicate_Employee("Given id already exists !");
				
				
			}
			
		}
		if(flag==false) {
		Frontdesk_staff.add(emp);
		System.out.println("Employee added successfully !");
		}
	}
	
	void remove(int id) {
		for (Employee employee : Frontdesk_staff) {
			if(id== employee.id) {
				Frontdesk_staff.remove(employee);
				System.out.println("Employee removed !");
			}
			
		}
	}
	
	
	void update(int id,String name, int salary, int age) {
		boolean flag = false;
		for (Employee employee : Frontdesk_staff) {
			if(id== employee.id) {
				employee.setName(name);
				employee.setSalary(salary);
				employee.setAge(age);
				
				System.out.println("Emplyee updated Successfully!");
				System.out.println(employee.toString());
				flag = true;
			}
			
		}
		
		
		if(flag == false) {
			 
					System.out.println("Id not matched");
				
		}
	}
	
	
	
	public static void main(String[] args) {
	//	ArrayList<Employee> Frontdesk_staff = new ArrayList<Employee>();

		Employee emp1 = new FrontDesk(101, "Rahul", 20000, 23);

		Employee emp2 = new FrontDesk(102, "Rutvik", 20000, 23);

		Employee emp3 = new FrontDesk(103, "Sanket", 20000, 23);

		
		Employee emp4 = new FrontDesk(104, "Krishna", 90000, 21);
		Employee emp5 = new FrontDesk(104, "Krishna", 90000, 21);

		
		Frontdesk_staff.add(emp1);
		Frontdesk_staff.add(emp2);
		Frontdesk_staff.add(emp3);
		
		for (Employee employee : Frontdesk_staff) {
			System.out.println(employee.toString());
		}
		
		FrontDesk f = new FrontDesk();
		
		try {
			f.add(emp4);
		} catch (Duplicate_Employee e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f.add(emp5);
		} catch (Duplicate_Employee e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===================================");
		System.out.println();
//		f.remove(103);
//		
//		
//		f.update(105, "Ram", 100000, 21);
		
		
		for (Employee employee : Frontdesk_staff) {
			System.out.println(employee.toString());
		}
		
		
		
		
	}

}
