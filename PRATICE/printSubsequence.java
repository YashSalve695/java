package PRATICE;

import java.util.Scanner;

public class printSubsequence {
	
	public static void printsub(String str,String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		printsub(ros , ans + ch);
		printsub(ros , ans + "");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printsub(str,"");

	}

}
