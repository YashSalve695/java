package PRATICE;

import java.util.*;

public class Test {
	
	public static void Count_mails(String str) {
		
		String strSplit[];
	
		
          for(int i = 0; i < str.length(); i++) {
        	 if(str.charAt(i) != '@') {
        		 continue;
        	 } else {
        		 strSplit = str.split("@");
        	 }
			  ArrayList<String> strList = new ArrayList<String>(
			            Arrays.asList(strSplit));
			  
			       
			   HashMap<String, Integer> map = new HashMap<>();
			   
			   for(String s : strSplit) {
				   map.put(s, 0);
			   }
			            
		System.out.println(map);
			        
        	 
	}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Count_mails(str);
	}

}
