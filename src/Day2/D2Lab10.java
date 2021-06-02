package Day2;

import java.util.StringTokenizer;

public class D2Lab10 {
static int counter=0;
	public static void main(String[] args) {
		// Count number of words
		StringTokenizer str = new StringTokenizer("this is my string of words to count", " ");
		
		while(str.hasMoreTokens()) {
			str.nextToken();
			counter++;
		}
System.out.println("This sentence has "+counter+" words.");
	}

}
