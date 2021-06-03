package Day3;

import java.util.ArrayList;

public class D3Lab6 {

	public static void main(String[] args) {
		// Write a program to join two array lists
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		ArrayList<String> arrList2 = new ArrayList<String>();
		
		arrList1.add("s11");
		arrList1.add("s12");
		arrList1.add("s13");
		arrList1.add("s14");
		arrList2.add("s21");
		arrList2.add("s22");
		arrList2.add("s23");
		arrList2.add("s24");
		
		arrList1.addAll(arrList2);
		
		System.out.println(arrList1);

	}

}
