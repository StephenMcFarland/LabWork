import java.util.Scanner;


public class Lab1 {

	static Scanner s = new Scanner(System.in);
	
	static String isbn;
	static String title;
	static String author;
	static double price;
	static int copies;
	
	public static void main(String[] args) {
		//1. WAP to accept a isbn,name, author,price, no of copies printed from user and print them using method?

		
		
		
		System.out.println("Enter the ISBN:  ");
		isbn = s.nextLine();
		
		System.out.println("Enter the title of the book:  ");
		title = s.nextLine();
		
		System.out.println("Enter the author:  ");
		author = s.nextLine();
		
		System.out.println("Enter the price:  ");
		price = s.nextDouble();
		
		System.out.println("Enter the number of copies:  ");
		copies = s.nextInt();
		
		printBook();
		
	}

	public static void printBook() {
		
		System.out.println("ISBN: "+isbn+"\n"+"Title: "+title+"\n"+"Author: "+author+"\n"+"Price: $"+price+"\n"+"Copies: "+copies+"\n");
	}
}
