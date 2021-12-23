package Algorithms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter how many of Fibonacci sequence to print.");
	    int N = in.nextInt();
        int sum = 0;
        int num1 = 0;
        int num2 = 1;

        for(int i=1; i<=N; i++){
            
            if(i<N){
                 System.out.print(num1 + " ");
            } else {
             System.out.print(num1);
        }
             sum = num1 + num2;
             //System.out.println("       1:"+num1+"    2:"+num2);
             num1 = num2;
             
	         num2 = sum;
	         //System.out.println("       1:"+num1+"    2:"+num2);
             
        }

	}

}
