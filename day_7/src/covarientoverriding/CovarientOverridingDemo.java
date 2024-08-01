package covarientoverriding;

class Colour{
	
	protected Colour getColour(){
		Colour c=new Colour();
		return c;
	}
}

class Red extends Colour{
	protected Red getRed() {
		Red c= new Red();
		return c;
	}
}

class Yellow extends Colour{
	protected Yellow getYellow() {
		Yellow s=new Yellow();
		return s;
	}
}

public class CovarientOverridingDemo {
	public static void main (String[] args) {
		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Red r=new Red();
		System.out.println(r.getRed());
		
	}
	
	

}
