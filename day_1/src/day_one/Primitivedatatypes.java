package day_one;

public class Primitivedatatypes {
	public static void main(String[] args) {
		
		//byte (1 byte)
		byte bmax=127;     
		byte bmin=-128;
		System.out.println("min range of byte is: "+bmin+" max range of byte is: "+bmax);
		
		//byte(2 byte)
		short smax= 32767;
		short smin= -32768;
		System.out.println("min range of short is: "+smin+" max range of short is: "+smax);
		
		//int(4 byte)
		int imin=-214748364;
		int imax=214748364;
		System.out.println("min range of int is: "+imin+" max range of int is:"+imax);
		
		//long(8 byte)
		long lmax=9223372036854775807L;
		long lmin=-9223372036854775807L;
		System.out.println("min range of long is: "+lmin+" max range of long is: "+lmax);
		
		float f= 3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is: "+f+" value of double is: "+d);

		
	}
}
