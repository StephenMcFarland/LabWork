package Day2;

public class D2Lab9 {
static int cols=1;
	public static void main(String[] args) {
		// Program to print half pyramid using *
		
		for(int i=1;i<15;i++) {
			for(int j=1;j<cols;j++) {
				System.out.print("*");
				
		}
			++cols;
System.out.println("");
	}

	}
}