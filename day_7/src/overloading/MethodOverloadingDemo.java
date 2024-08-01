package overloading;

public class MethodOverloadingDemo {
		public static void main(String[]args) {
			
			System.out.println("-----Constructor Overloading-----");
			Point p=new Point();
			System.out.println(p);
			
			Point p1=new Point (14.5f);
			System.out.println(p1);
			
			Point p2=new Point(12.6f,45.6f);
			System.out.println(p2);
			
			System.out.println("------Method Overloading------");
			System.out.println("Addition of two integers="+MethodOverloading.addition(5,100));
			System.out.println("Addition of two float="+MethodOverloading.addition(5.33f,100.34f));
			System.out.println("Addition of two String="+MethodOverloading.addition("5","100"));
			System.out.println("Addition of three numbers="+MethodOverloading.addition(5,2,100));
			
			
			
		}

	}

