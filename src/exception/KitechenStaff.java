package exception;

public class KitechenStaff extends Employee {
	public KitechenStaff(int id, String name, int salary, int age) {
		super(id, name, salary, age);
		// TODO Auto-generated constructor stub
	}

	int salary = 20000;

	int getSalary() {
		return salary;
	}
}
