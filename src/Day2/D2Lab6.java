package Day2;

public class D2Lab6 {
static double average;
static int sum;
	public static void main(String[] args) {
		// Program to Calculate Average Using Arrays
		int[] arr = {3,4,7,44,99,55,12,22,20,98,95};
		
		
		for(int i : arr) {
			
			sum+=i;
			average = sum/arr.length;
			
		}
		System.out.println(average);
	}

}
