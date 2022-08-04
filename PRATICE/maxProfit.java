package PRATICE;

import java.util.*;

public class maxProfit {
	
	public static void swap(int arr[], int right, int left) {
		
		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}
	
	public static int Profit(int arr[], int k) {
		
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			if(val > pq.peek()) {
				pq.add(val);
				sum += pq.remove();
				
			} else {
				
				sum = 0;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		 for(int i = 0; i < n; i++) {
			 arr[i] = sc.nextInt();
		 }
		int k = sc.nextInt();
		int res = Profit(arr, k);
		 System.out.println(res);
	}
}
