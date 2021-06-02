package Day2;

public class D2Lab8 {
static int vowels=0;
static int consonants=0;
static int digits=0;
static int spaces=0;

	public static void main(String[] args) {
		// Program to count vowels, consonants, digits, and spaces
		
		String str = "eeaiounb de092n3a  2eiou";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			switch(c) {
			case 'a':
				++vowels;
				break;
			case 'e':
				++vowels;
				break;
			case 'i':
				++vowels;
				break;
			case 'o':
				++vowels;
				break;
			case 'u':
				++vowels;
				break;
			case '0':
				++digits;
				break;
			case '1':
				++digits;
				break;
			case '2':
				++digits;
				break;
			case '3':
				++digits;
				break;
			case '4':
				++digits;
				break;
			case '5':
				++digits;
				break;
			case '6':
				++digits;
				break;
			case '7':
				++digits;
				break;
			case '8':
				++digits;
				break;
			case '9':
				++digits;
				break;
			case ' ':
				++spaces;
				default:
					++consonants;
					break;
			}
			System.out.println("Vowels: "+vowels+"\n");
			System.out.println("Consonants: "+consonants+"\n");
			System.out.println("Digits: "+digits+"\n");
			System.out.println("Spaces: "+spaces+"\n");
		}

	}

}
