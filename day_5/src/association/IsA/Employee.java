package association.IsA;

public class Employee {
	private String name;
	private int employeeid;
	private String department;
	
	//constructor
	public Employee() {
		super();
	}
	public Employee(String name,int employeeid, String department) {
		super();
		this.name=name;
		this.employeeid=employeeid;
		this.department=department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public int getEmployeid() {
		return employeeid;
	}
	public void setEmployeid(int employeeid) {
		this.employeeid=employeeid;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name+", employeId" +employeeid+", department= "+department+"]";
	}

}
