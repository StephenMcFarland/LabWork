package Algorithms;

import java.util.Scanner;



//Clash of Code Challenge
public class removeDupsExceptLast {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String S = in.nextLine();
	        StringBuilder sb = new StringBuilder();

	  for(int i=0;i<S.length();i++){
	       String t=S.substring(i,i+1);
	          String S2=S.substring(i+1,S.length());
	          
	      if(S2.contains(t)){
	         
	      }else{
	          sb.append(t);
	      }
	  }

	        System.out.println(sb);
	    }

	}


