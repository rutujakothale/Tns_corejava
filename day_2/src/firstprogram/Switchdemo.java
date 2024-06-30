package firstprogram;

public class Switchdemo {
	public static void main(String[]args) {
		char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" Is a leader");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" Is a digital");
			break;
		case 'w':
		case 'W':
			System.out.println(x+" Is a work");
			break;
		case 's':
		case 'S':
			System.out.println(x+" Is a staff");
			break;
			default:
				System.out.println(x+" is other than letters provided ");
				break;
		}
	}

}
