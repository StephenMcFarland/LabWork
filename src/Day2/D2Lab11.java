package Day2;

public class D2Lab11 {

	public static void main(String[] args) {
		// Find the occurance of a specific character in sentence
		String str = "aejefijfbbb;alkdfjbbj;sldkfj bbjslkdjfb";
		char c = 'b';
		
		int counter = str.length() - str.replace("b", "").length();
		
		System.out.println("The number of occurances of the letter b in your string is "+counter);
		

	}

}
