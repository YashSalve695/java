package PRATICE;

import java.util.*;

public class GMP {
	
	public static ArrayList<String> gmp(int sr,int sc,int dr,int dc){
		
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> vpaths = new ArrayList<>();
		ArrayList<String> hpaths = new ArrayList<>();
		
		if(sr < dr) {
		 hpaths = gmp(sr + 1,sc,dr,dc);
		}
		if(sc < dc) {
		
	     vpaths = gmp(sr,sc + 1,dr,dc);
		}
		
		ArrayList<String> totalpaths = new ArrayList<>();
		
		for(String res : hpaths) {
			totalpaths.add("h" + res);
		}
		for(String res : vpaths) {
			totalpaths.add("v" + res);
		}		 
				return totalpaths;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<String> path = gmp(1,1,m,n);
		System.out.println(path);

	}

}
