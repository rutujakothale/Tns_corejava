package staticvariablemethod;

public class EmployeeDemo {
	public static void main(String[] args) {
		// create first object of class and pass two arguments with type
		Employee e=new Employee("Rutuja",101);
		System.out.println(e);
		
		//similarly we can create diff objects for employee
		e=new Employee("Akanksha",102);
		System.out.println(e);
	}

}
