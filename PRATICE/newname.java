package PRATICE;

import java.util.*;

public class newname {

  private static int solve(int n) {
    
	  int plus = 0;
	  int minus = 0;
	 
	
	  
	  if(n % 2 != 0) {
		  minus--;
		  
	  } else {
		  plus++;
	  }
	 
	  return Math.min(plus, minus);
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        int n = in.nextInt();
        System.out.println("Case #" + t + " " + solve(n) + ".");
      }
    }
  }
}
