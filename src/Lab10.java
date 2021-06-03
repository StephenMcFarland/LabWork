
public class Lab10 {
	
		  public static void main(String[] args) {
		      
		    int base = 3;
		    int exp = 4;
		    int result = power(base, exp);

		    System.out.println(base + "^" + exp + " = " + result);
		  }

		  static int power(int base, int exp) {
		    if (exp != 0) {

		      // recursive call to power()
		      return (base * power(base, exp - 1));
		    }
		    else {
		      return 1;
		    }
		  }
		
}
