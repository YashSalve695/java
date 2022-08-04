package PRATICE;

import java.util.Arrays;
import java.util.Scanner;

public class Twosum {
	
	public static void twoSum(int arr[],int target) {
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			
			if(arr[start] + arr[end] == target) {
				System.out.println(arr[start] + " " + arr[end]);
				start++;
				end--;
				
			} else if(arr[start] + arr[end] > target) {
				end--;
				
			} else if(arr[start] + arr[end] < target) {
				start++;
			}
			
		}
		
	}

	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int arr[] = new int[n];
       for(int i = 0; i < n; i++) {
    	   arr[i] = sc.nextInt();
       }
       int target = sc.nextInt();
       twoSum(arr,target);
       
	}

}
