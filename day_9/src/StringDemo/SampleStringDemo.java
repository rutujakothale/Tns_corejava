package StringDemo;

public class SampleStringDemo {
	public static void main(String[] args) {
		
		//initialize string
		char c[]= {'I','n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		//concatenate to prevent long lines
		String longstr="This is to show"+" how long sentences"+" can be printed";
		System.out.println(longstr);
		
		
	}

}
