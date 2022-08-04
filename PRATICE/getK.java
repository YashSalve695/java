package PRATICE;

import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class getK {
	
	private static String getk(List<Integer> arr, int k) {
		
		String ans = "";
		
		
		if(arr.contains(k) == true) {
			ans += "Yes";
			
		} else {
			
			ans += "No";
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>(n);
		 for(int i = 0; i < arr.size(); i++) {
			 arr.get(i);
		 }
		 int k = sc.nextInt();
       String res = getk(arr, k);
        System.out.println(res);
	}

}
