package staticblockmethod;

public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("-------Within stack block--------");
		srNo=100;
	}
	
	MyClass(){
		System.out.println("-------Default Constructor-------");
		srNo++;
		section++;
	}
	
	@Override
	public String toString() {
		return "Myclass [serial no:"+srNo+",section"+section+"]";
	}
	
	static void display() {
		//System.out.println("Section"+section); // cant access non static member
		System.out.println("Serial no:"+srNo);
	}

}
