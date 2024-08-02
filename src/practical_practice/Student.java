package practical_practice;

public class Student {
	private long id;
	private String name;
	private int age;
	private String standard;
	
	
	 public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getStandard() {
		return standard;
	}
	
	// standard read only
	private void setStandard(String standard) {
		this.standard = standard;
	}
	public Student(long id, String name, int age, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.standard = standard;
	}
	
	Student(){}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", standard=" + standard + "]";
	}
	
// setter private = > read only
	
// getter private => write only	
	
	
		
//		
//		// task 
//		
//		// teacher task managing student
//		
//		
//		// book use = management 
//		
//		// software development - CRUD operation
//		
//		// create
//		// read
//		// update
//		// delete
//		
//		
//		// bean class
//		
//		
//		


}
