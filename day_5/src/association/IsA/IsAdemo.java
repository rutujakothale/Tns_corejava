package association.IsA;

public class IsAdemo {
	public static void main(String[] args) {
		 
		Employee employee=new Employee("Rutuja",01,"EnTC");
		Manager manager=new Manager("Akanksha",02,"HR",8);
		
		System.out.println(employee);
		System.out.println("----------------------------");
		System.out.println(manager);
	}

}
