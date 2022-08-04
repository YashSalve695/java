 package TwoDimensionalArray;

import java.util.Scanner;
//
public class SpiralTraversal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		 int arr[][] = new int[n][m];
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[0].length; j++) {
				 arr[i][j] = sc.nextInt();
			 }
		 }
		 
		 int minrow = 0;
		 int mincol = 0;
		 int maxrow = arr.length - 1;
		 int maxcol = arr[0].length - 1;
		 int count = 0;
		 int totalnum = n*m;
		 
		 while(count < totalnum) {
			 
          //	LEFT WALL	
			 for(int i = minrow,j = mincol; i <= maxrow && count < totalnum; i++) {
			    System.out.println(arr[i][j]);
			 	     count++;
            }
                     mincol++;
           
          //    BOTTOM WALL
            for(int i = maxrow,j = mincol; j <= maxcol && count < totalnum; j++) {
                System.out.println(arr[i][j]);
                    count++;
             }
                     maxrow--;
    
         //   RIGHT WALL
            for(int i = maxrow,j = maxcol; i >= minrow && count < totalnum; i--) {
                System.out.println(arr[i][j]);
                   count++;
             }
                   maxcol--;
                   
         //    TOP WALL
           for(int i = minrow,j = maxcol; j >= mincol && count < totalnum; j--) {
               System.out.println(arr[i][j]);
                  count++;
            }
                  minrow++;
		 }	 
		 
		 
	}
	
}