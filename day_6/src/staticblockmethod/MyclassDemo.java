package staticblockmethod;

public class MyclassDemo {
	public static void main(String[] args) {
		MyClass.display();
		System.out.println();
		
		MyClass o1=new MyClass();
		System.out.println(o1);
		
		MyClass.display();
		System.out.println();
		
		MyClass o2= new MyClass();
		System.out.println(o2);
		MyClass.display();
		
		MyClass o3=new MyClass ();
		System.out.println(o3);
		MyClass.display();
	}

}
