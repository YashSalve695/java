package PRATICE;

import java.util.*;

public class Main {
	
	public static void solve(int totalshampoo, int a, int b, int c) {
	
		int sub = 0;
		
		
		if(a > totalshampoo ) {
			sub = totalshampoo - a;	
			System.out.println("F");
		}
		if(sub > b ) {
			sub = sub - b;
			System.out.println("M");
		}
		if(sub > c ) {
			sub = sub - c;
			System.out.println("T");
		}
	  }	
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		 int shampoo = sc.nextInt();
		 
		 int father = sc.nextInt();
		 int mother = sc.nextInt();
		 int son = sc.nextInt();
		 
		 solve(shampoo, father, mother, son);
		
	}
}