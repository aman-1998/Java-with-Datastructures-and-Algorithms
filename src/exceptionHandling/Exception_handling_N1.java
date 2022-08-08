package exceptionHandling;

public class Exception_handling_N1 {
	
	public static void main(String[] args) {
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[2][];
		int[][] mat3 = {{1,2,3},
						{5,8,1},
						{5,9}};
		mat1[0][0] = 1;
		mat1[0][1] = 2;
		mat1[0][2] = 3;
		mat1[1][0] = 4;
		mat1[1][1] = 5;
		mat1[1][2] = 6;
		
		mat2[0] = new int[]{3,6,8,7};
		mat2[1] = new int[]{4,9};
		
		
		try {
			System.out.println("Mat1 :- ");
			for(int i = 0; i <= mat1.length; i++) {
				for(int j = 0; j <= mat1[i].length-1; j++)
					System.out.print(mat1[i][j]);
				System.out.println();
			}
			
			System.out.println("Mat2 :- ");
			for(int[] i : mat2) {
				for(int j : i)
					System.out.print(j);
				System.out.println();
			}
			
			System.out.println("Mat3 :- ");
			for(int[] i : mat3) {
				for(int j : i)
					System.out.print(j);
				System.out.println();
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured at line no. " + e.getStackTrace()[0].getLineNumber());
		}
	}
}
