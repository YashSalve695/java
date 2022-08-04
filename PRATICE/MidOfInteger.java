package PRATICE;

import java.util.Scanner;

public class MidOfInteger {
	
	static long middigit(long n) {
		
		long digit = (long)Math.log10(n) + 1;
		  /** FIND TOTAL NUMBER OF DIGIT */
		
		n = (long)(n / Math.pow(10, digit / 2)) % 10;
		  /** FIND MIDDLE DIGIT */
		
		return n; /** return middle digit*/
	}

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/**
		int digitnumber = String.valueOf(n).length();
		double val = (long) Math.pow(10.0, (long)(digitnumber / 2));
		
		long div = new Double(val).intValue();
		
		long left = n / 10;
		long right = n % 10;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Value : ");
		sb.append(n);
		sb.append('\n');
		
		sb.append("Left : ");
		sb.append(left);
		sb.append('\n');
		
		sb.append("Right : ");
		sb.append(right);
		sb.append('\n');
		
		System.out.println(sb.toString());
		*/
		
		while(n > 0) {
			
			System.out.println(n % 10);
			n = n / 10;
			
		}
		
		long ans = middigit(n);
		 System.out.println(ans);
	}


}
