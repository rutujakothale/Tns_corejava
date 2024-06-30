package firstprogram;

public class operatordemo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a and b value before the operator:" +a +" " +b);
		++a;
		int c=++a+b+a--;
		System.out.println("c value after operator:" +c);
		
		int d= c++ +a +b--;
		System.out.println("d value after operator:"+d);
	}

}
