
public class Lab3SwapTwoTemp {

	static int num1 = 3;
	static int num2 = 5;
	static int temp = 0;

	public static void main(String[] args) {
		// Swap two numbers using temporary variable
		printNums();

		temp = num2;
		num2 = num1;
		num1 = temp;
		
		printNums();
	}

	static void printNums() {
		System.out.println("num1 = " + num1 + " num2 = " + num2 + " temp = " + temp);
	}
}
