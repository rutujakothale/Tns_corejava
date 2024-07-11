package usingfinal;


final class FinalClass{
	void show() {
		System.out.println("Final Class cannot be inherited");
	}
}
// cant create child class from final class, ex:String ,wrapper class ,System, Scanner,Number are final classes


public class FinalClassDemo {
	public static void main(String[]args) {
		FinalClass f1=new FinalClass();
		f1.show();
	}
}
