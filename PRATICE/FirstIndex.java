package PRATICE;

import java.util.Scanner;

public class FirstIndex {
	
	public static int firstIndex(int arr[],int index,int x) {
		
		if(index == arr.length) {
			return -1;
		}
		
		int fi = firstIndex(arr,index + 1,x);
		 if(arr[index] == x) {
		   return index;
			} else {
				return fi;
			}
}		

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			 for(int i = 0; i < arr.length; i++) {
				 arr[i] = sc.nextInt();
				 
				int one =  firstIndex( arr ,0, x);
						 System.out.println(one);
			 }
		}
		
		
		
		}

}
