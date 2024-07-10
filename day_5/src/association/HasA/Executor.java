package association.HasA;

public class Executor {
	public static void main(String[] args) {
		Address address=new Address("Hadapsar","Pune","Maharashtra","411072");
		Person person=new Person("Rutuja",address);
		person.displayInfo();
		System.out.println(person);
		
	}

}
