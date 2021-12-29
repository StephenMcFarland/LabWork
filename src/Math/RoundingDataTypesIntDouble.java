package Math;

public class RoundingDataTypesIntDouble {

	public static void main(String[] args) {
		int x=42;
		int h=32;
		
		System.out.println((int)(Math.floor(Math.sqrt((x*x)+(h*h)))));
		
		System.out.println((int)(Math.sqrt((x*x)+(h*h))));
		
		System.out.println((Math.floor(Math.sqrt((x*x)+(h*h)))));
		
		System.out.println((Math.sqrt((x*x)+(h*h))));

	}

}
