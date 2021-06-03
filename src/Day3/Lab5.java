package Day3;

import java.util.ArrayList;

public class Lab5 {

	public static void main(String[] args) {
		// Search an element in a array list

ArrayList<String> arrList1 = new ArrayList<String>();
		boolean hasElement;
		
		arrList1.add("string 1");
		arrList1.add("string 2");
		arrList1.add("string 3");
		arrList1.add("string 4");
		
		
		
		hasElement = arrList1.contains("string 3");
		
		System.out.println(hasElement);
	}

}
