package Day3;

import java.util.LinkedList;
import java.util.ListIterator;

public class D3Lab3 {

	public static void main(String[] args) {
		// Iterate a linked list in reverse order.
		LinkedList<String> linkedList = new LinkedList<String>();	  
		  
		  linkedList.add("item1");
		  linkedList.add("item2");
		  linkedList.add("item3");
		  linkedList.add("item4");
		ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
	      System.out.println("List displayed using list iterator:");
			/*
			 * while (itrator.hasNext()) { System.out.println(itrator.next());
			 * 
			 * }
			 */
	      while (iterator.hasPrevious()) {
	          System.out.println(iterator.previous());

	}

}
}
