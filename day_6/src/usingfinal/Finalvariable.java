package usingfinal;

public class Finalvariable {
	// final int x;
	final int x=100;
	
	//declare a static blank final variable
	final static int y;
	
	//declare and initialized static final variable
	final static int z=10;
	
	//instance method
	void change() {
		// x=30;   final variables cant be re assigned 
		// y=200;  final static variables cant be reassigned
	}
	@Override
	public String toString() {
		return "Final Variable [x="+x+",y="+y+"]";
	}
	
	//declare static block to initialize the final static variable-- y
	static {
		y=20;
		// z=100;    once initialised cannot be reassigned
		System.out.println("Value of Y:"+y);
	}
}
