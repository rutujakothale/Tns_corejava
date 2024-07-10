package hierarchialinheritance;

public class HierarchialDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println("--------Person Details----------");
		System.out.println(p1);
		
		Person p;
		p=new Person("Rutuja","Pune");
		System.out.println("Person Details:"+p);
		
		p=new Employee("Akanksha","Mumbai",1002,23000f,"HR");
		System.out.println("Employee Details:"+p);
		
		p=new Student ("Aditya","Pune","SE",89f);
		System.out.println("Student details:"+p);
		
		Student s1=new Student();
		System.out.println(s1);
		
		Employee e1=new Employee();
		System.out.println(e1);
	}

}
