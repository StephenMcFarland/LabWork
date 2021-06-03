package Day3;

import java.util.ArrayList;

public class D3Lab2 {

	public static void main(String[] args) {
		// Write a program to clone an array list to another array list using clone() of arraylist.
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		ArrayList<String> arrList2 = new ArrayList<String>();
		
		arrList1.add("s1");
		arrList1.add("s2");
		arrList1.add("s3");
		arrList1.add("s4");
		
		arrList2 = (ArrayList) arrList1.clone();
		
		System.out.println(arrList2);

	}

}
