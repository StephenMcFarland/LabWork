package Day2;

public class D2Lab5 {

	public static void main(String[] args) {
		// Calculate the power of a number using a for loop.
		int num = 2;
		for(int i=1;i<8;i++) {
			int power = (int) Math.pow(num,i);
			System.out.print(power+" ");
			
		}
	}

}
