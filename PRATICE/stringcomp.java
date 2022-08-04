package PRATICE;

import java.util.Scanner;

public class stringcomp {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      s.charAt(0);
      for(int i = 1; i < s.length(); i++) {
    	  char ch1 = s.charAt(i);
    	  char ch2 = s.charAt(i - 1);
    	  
    	  if(ch1 != ch2) {
    		  s += ch1;
    	  }
    	  System.out.println(s);
          
      }
      

	}

}
