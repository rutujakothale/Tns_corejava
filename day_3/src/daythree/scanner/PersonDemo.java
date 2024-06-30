package daythree.scanner;

import java.util.Scanner;
public class PersonDemo {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter person name: ");
		name=ob.next();
		System.out.println("Enter age: ");
		int age=ob.nextInt();
		System.out.println("Enter Gender: ");
		String gender=ob.next();
		
		System.out.println("Enter income: ");
		int income=ob.nextInt();
		
		// person object and initialize values using setter
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details using toString() method
		System.out.println(person);
		
		Taxcalculation calc=new Taxcalculation();
		calc.calculateTax(person);
		System.out.println("After calculation tax:");
		
		System.out.println(person);
		
	}

}
