package PRATICE;
import java.util.*;


public class AliceAndBob {
	
	public static boolean isConstant(char ch) {
		
		if(ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || 
		   ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' ||ch == 'l'  || 
	       ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' ||ch == 'r'  || 
	       ch == 's' || ch == 't' || ch == 'u' || ch == 'v' ||ch == 'w'  || 
	       ch == 'x') {
							 return true;
						}
						return false;
	}
	
    public static boolean isVowel(char ch) {
	
		
	if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ||
	   ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
				 return true;
			}
			return false;
	}
	

	  private static String getRuler(String kingdom) {
	   
	    String ruler = "";
	     
        kingdom.toCharArray();
        int j = kingdom.length() - 1;
        
	    	char ch = kingdom.charAt(j);
	    	
	    	if(ch == ' ') {
	    		ruler += "nobody";
	    	}
	    	
	    	if(isVowel(ch) == true) {
	    		
	    		ruler += "Alice";
	    		
	    } else if(isConstant(ch) == true) {
	    	
	    	    
	    	    ruler += "Bob";
	    
	    } else if(ch == 'y') {
	    	
	            ruler += "nobody";    	
	    }
	    
	    
	    
	    return ruler;
	  }

	  public static void main(String[] args) {
	    try (Scanner in = new Scanner(System.in)) {
	      int T = in.nextInt();

	      for (int t = 1; t <= T; ++t) {
	        String kingdom = in.next();
	        System.out.println(
	            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
	      }
	    
	    }
	  }
}
	

