package Day2;

public class D2Lab7 {

	static int sum;
	public static void main(String[] args) {
		// Add Two Matrix Using Multi-dimensional Arrays
		int[][] twoDimArr1 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int[][] twoDimArr2 = {{10,20,30,40,50},{60,70,80,90,100},{111,121,131,141,151}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				sum = twoDimArr1[i][j]+twoDimArr2[i][j];
				System.out.print(sum+" ");
			}
			System.out.println("");
		}
	}

}
