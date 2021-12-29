package Algorithms;

import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String S = in.nextLine();
	String Z = "abcdefghijklmnopqrstuvwxyz";
	boolean p=false;
	S=S.toLowerCase();

	  for(int i=0;i<Z.length();i++){
	      if(S.contains(String.valueOf(Z.charAt(i)))){
	          p=true;
	      }else{p=false;break;}
	  }

	        System.out.println(p);
	    }

	}


