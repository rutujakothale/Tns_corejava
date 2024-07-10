package hierarchialinheritance;

public class Employee extends Person{
	private int empid;
	private float salary;
	private String dept;
	
	public Employee() {
		System.out.println("Employee default constructor");
		empid=1;
		salary=1000000f;
		dept="IT";
	}
	
	public Employee(String name, String city, int empid,float salary, String dept) {
		super(name,city);
		this.empid=empid;
		this.salary=salary;
		this.dept=dept;
	}
	
	
	public int getId() {
		return empid;
	}
	public void setId(int empid) {
		this.empid=empid;
	}
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		return "Employee [empid="+empid+", salary="+salary+",department="+dept+",getName()="+getName()+",getcity()="+getCity()+"]";
	}

}
