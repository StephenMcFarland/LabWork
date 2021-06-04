package Day2;

public class D2Lab12 {

	public static void main(String[] args) {
		// Remove all the space from string 
		String strwithspace = "    stringwithsomespaces      ";
		System.out.println("Untrimmed: "+strwithspace+strwithspace);
		String trimmed = strwithspace.trim();
		
		System.out.println("Trimmed: "+trimmed+trimmed);

	}

}
