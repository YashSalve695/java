package PRATICE;

import java.util.*;

public class ghg {

	 static String[] codes = {";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	    public static ArrayList<String> getKpc(String str){

	        if(str.length() == 0){
	            ArrayList<String> bres = new ArrayList<>();
	            bres.add("");
	            return bres;
	        }

	        char ch = str.charAt(0);
	        String subs = str.substring(1);

	        ArrayList<String> result = getKpc(subs);

	        ArrayList<String> myresult = new ArrayList<>();

	        String codecs = codes[ch - 0];

	           for(int i = 0; i < codecs.length(); i++){
	               char code = codecs.charAt(i);
	               
	               for(String rec : result){
	                   myresult.add(code + rec);
	               }
	           }
	           return myresult;
	    }


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        String s = sc.next();

	        ArrayList<String> res= getKpc(s);
	         System.out.println(res);
	    }
}
