package PRATICE;

import java.util.Scanner;

public class DivisibleWithinRange {
	
	public static int FindCount(int x, int y) {
		
	     int count = 0;
	     
	     for(int i = count; count <= 10; count++) {
	    	 if(x * count == y) {
	    		 break;
	    	 }
	     }
	     return count;
	}

	public static void main(String[] args) {
		
             Scanner sc = new Scanner(System.in);
             int x = sc.nextInt();
             int y = sc.nextInt();
             
          
             System.out.println(FindCount(x,y));
	}

}
