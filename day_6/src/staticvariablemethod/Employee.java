package staticvariablemethod;

public class Employee {
	private String name;  // declare instance variable
	private int id;
	
	//declare a static variable company name with data type string assign value
	//TNS i.e common for all objects
	
	static String companyname="TNS";
	
	//declare two parameter constructor
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Employee [name="+name+",id="+id+",Company="+companyname+"]";
	}
}
