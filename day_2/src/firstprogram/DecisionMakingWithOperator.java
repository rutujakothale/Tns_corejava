package firstprogram;

public class DecisionMakingWithOperator {
	public static void main(String[] args) {
		int x=8,y=7;
		int a=10;
		int b=11;
		
		if (x>=y) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		//  10<11   10==11
		if (!(a<b)||(a==b)) {
			System.out.println("condition is true");
		}else {
			System.out.println("condition is false");
		}
	}

}
