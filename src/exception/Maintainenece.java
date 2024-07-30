package exception;

public class Maintainenece extends Employee {
	public Maintainenece(int id, String name, int salary, int age) {
		super(id, name, salary, age);
		// TODO Auto-generated constructor stub
	}

	int salary = 90000;

	int getSalary() {
		return salary;
	}
}
