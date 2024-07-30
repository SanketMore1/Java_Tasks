package Iteration_Task;

import java.util.ArrayList;
import java.util.List;

public class Residents {

	long aadhar_no;
	String name;
	int age;
	double plot_size;
	
	public Residents(long aadhar_no, String name, int age, double plot_size) {
		super();
		this.aadhar_no = aadhar_no;
		this.name = name;
		this.age = age;
		this.plot_size = plot_size;
	}
	
	Residents(){}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPlot_size() {
		return plot_size;
	}

	public void setPlot_size(double plot_size) {
		this.plot_size = plot_size;
	}
	
	}
