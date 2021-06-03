package Day3;

import java.util.ArrayList;

public class D3Lab1 {

	public static void main(String[] args) {
		// Write a Java program of swap two elements in an array list which holds the strings.

		ArrayList<String> arrList1 = new ArrayList<String>();
		
		arrList1.add("string 1");
		arrList1.add("string 2");
		arrList1.add("string 3");
		arrList1.add("string 4");
		
		System.out.println("Start: "+arrList1);
		
		arrList1.add(arrList1.get(0));
		
		System.out.println("Add first to end: "+arrList1);
		
		arrList1.set(0,arrList1.get(3));
		
		System.out.println("Set last to first: "+arrList1);
		
		arrList1.remove(3);
		
		System.out.println("Remove original last: "+arrList1);
	}

}
