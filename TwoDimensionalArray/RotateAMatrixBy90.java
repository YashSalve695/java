package TwoDimensionalArray;

import java.util.Scanner;

public class RotateAMatrixBy90 {
	
	//UTILITY FUNTION TO PRINT ARRAY
	public static void PrintArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[0].length; j++) {
				 arr[i][j] = sc.nextInt();
			 }
		 }
		 //TRANSPOSE OF MATRIX
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = i; j < arr[0].length; j++) {
				 
				  int temp = arr[i][j];
				  arr[i][j] = arr[j][i];
				  arr[j][i] = temp;
 			 }
		 }
		  for(int i = 0; i < arr.length; i++) {
			  
			  int left = 0;
			  int right = arr[i].length - 1;
			    
			  while(left < right) {
				  int temp = arr[i][left];
				  arr[i][left] = arr[i][right];
				  arr[i][right] = temp;
				  
				  left++;
				  right--;
			  }
		  }
		PrintArray(arr);
	}

}
