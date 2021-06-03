package Day3;

public class D3Lab10 {

	interface Shape1{
		public void sq(int base, int exponent);
	}
	public static void main(String[] args) {
		// Write a lambda expression to generate the square of a number.

		 //with lambda  
        Shape1 d2=(base, exponent)->{  
            System.out.println("Square "+Math.pow(2,7));  
        };  
        d2.sq(2,7);
	}

}
