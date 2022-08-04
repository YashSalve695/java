package PRATICE;

import java.util.*;

public class keypad {
	
	 static  String[] codes = {".;","abc","def","ghi","jkl",
             "mno","pqrs","tu","vwx","yz"};
	 
	 public static ArrayList<String> kpc(String str){
		 
		 if(str.length() == 0) {
			 ArrayList<String> base = new ArrayList<>();
			 base.add("");
			 return base;
		 }
		 
		 char ch = str.charAt(0);
		 String ros = str.substring(1);
		 
		 ArrayList<String> result = kpc(ros);
		 
		 ArrayList<String> myresult = new ArrayList<>();
		 
		 String code = codes[ch - '0'];
		  for(int i = 0; i < code.length(); i++) {
			  char chcode = code.charAt(i);
			  for(String strs : result) {
				  myresult.add(chcode + strs);
			  }
		  }
		  return myresult;
	 }

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> codes = kpc(str);
		System.out.println(codes);

	}

}
