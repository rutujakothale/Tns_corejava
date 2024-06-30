package day_one;

public class Typecasting {
	public static void main(String[] args) {
		//implicit typecasting
		
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		System.out.println(i);
		
		char val1='\u00A7';
		System.out.println(val1);
		
		double f1=10.52f;
		long l1=(long) f1;
		System.out.println(l1);
		
		long l2=98654323456789l;
		int i1=(int) l2;
		System.out.println(i1);
		
		float f2=34.56f;
		int i2=(int) f2;
		System.out.println(i2);
	}

}
