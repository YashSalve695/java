package Datatypes;

import java.util.Scanner;

public class introduction {
	
	public static int MINMAX(int a, int b) {
		
		
		if(a > b) {
			return a;
		}
		else return b;
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	int res = MINMAX(n, m);
	 System.out.println(res);
	}
  
}
