package PRATICE;

import java.util.*;

public class getSebsequence {
	
	public static ArrayList<String> getSub(String s){
		
		if(s.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		
		ArrayList<String> result = getSub(ros);
		
		ArrayList<String> myresult = new ArrayList<>();
		
		for(String recurseresult:result) {
			myresult.add("" + recurseresult);
		}
		for(String recurseresult:result) {
			myresult.add(ch + recurseresult);
		}
		return myresult;
	}

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        ArrayList<String> result = getSub(str);
        System.out.println(result);
	}

}
