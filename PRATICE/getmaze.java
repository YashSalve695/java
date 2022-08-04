package PRATICE;

import java.util.*;

public class getmaze  {
	
	public static ArrayList<String> GMP(int sr,int sc,int dr,int dc){
		
		if(sr == dr || sc == dc) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		
		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();
		
		if(sr < dr) {
			hpaths = GMP(sr + 1,sc,dr,dc);
		}
		if(sc < dc) {
			vpaths = GMP(sr,sc + 1,dr,dc);
		}
		ArrayList<String> result = new ArrayList<>();
		

        for(String hpath:hpaths) {
            result.add("h" + hpath);
         }

        for(String vpath:vpaths) {
            result.add("v" + vpath);
         }
  return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<String> paths = GMP(1,1,m,n);
		System.out.println(paths);
		
	}

}
