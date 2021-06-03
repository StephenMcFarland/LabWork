
public class Lab14 {

	static int sum = 0;
	
	public static void main(String[] args) {
		// Add all even numbers from 1-10.
		
		for(int i=0;i<=10;i++) {
			
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("The sum of all even numbers between 1 and 10: "+sum);
	}

}
