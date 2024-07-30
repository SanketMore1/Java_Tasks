package exception;

public class HouseKeeping extends Employee {
	public HouseKeeping(int id, String name, int salary, int age) {
		super(id, name, salary, age);
		// TODO Auto-generated constructor stub
	}

	int salary = 9000;

	int getSalary() {
		return salary;
	}

	void cleanRoom() {
		System.out.println("Room is cleaned !.");
	}
}
