package Day3;

import java.util.LinkedList;

public class D3Lab4 {

	public static void main(String[] args) {
		// Write a Java program to insert the specified element at the end of a linked list using offerLast().

		LinkedList<String> linkedList1 = new LinkedList<String>();
		
		linkedList1.add("string 1");
		linkedList1.add("string 2");
		linkedList1.offerLast("specified element at the end");
		linkedList1.add("string 3");
		linkedList1.add("string 4");
		
		
		System.out.println("linkedList1: "+linkedList1);
		
	}

}
