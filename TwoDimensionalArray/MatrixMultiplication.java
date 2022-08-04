package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		System.out.println("FIRST MATRIX");
		
	Scanner sc = new Scanner(System.in);
	int row1 = sc.nextInt();
	int col1 = sc.nextInt();
	int one[][] = new int[row1][col1];
	  for(int i = 0; i < one.length; i++) {
		  for(int j = 0; j < one[0].length; j++) {
			  one[i][j] = sc.nextInt();
		  }
	  }
	  System.out.println("SECOND MATRIX");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int two[][] = new int[row2][col2];
		  for(int i = 0; i < two.length; i++) {
			  for(int j = 0; j < two[0].length; j++) {
				  two[i][j] = sc.nextInt();
			  }
		  }
		  if(col1 != row2) {
			  System.out.println("INVALID INPUT");
			  return;
		  }
		int product[][] = new int[row1][col2];
		for(int i = 0; i < product.length; i++) {
			for(int j = 0; j < product[0].length; j++) {
				for(int k = 0; k < col1; k++) {
					product[i][j] = one[i][k] * two[k][j];
				}
			}
		}
         for(int i = 0; i < product.length; i++) {
        	 for(int j = 0; j < product[0].length; j++) {
        		 System.out.print(product[i][j] + " ");
        	 }
        	 System.out.println();
         }
	}

}
