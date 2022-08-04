package PRATICE;

public class SearchInSortedRotatedArray {
	
	public static int binarySearch(int a[],int key) {
		
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high/2);
			 if(a[mid] == key) {
				 return mid;
			 }
			 if(a[low] < a[mid]) {
				 if(key >= a[low] && key < a[mid]) {
					 high = mid - 1;
				 } else {
					 low = mid + 1;
				 }
			 } else {
				 if(key > a[mid] && key <= a[mid]) {
					 low = mid + 1;
				 } else {
					 high = mid - 1;
				 }
			 }
		}
		return -1;
	}

	public static void main(String[] args) {
	     
		
		int arr[] = {1,3,4,5,6,7,2,1};
		//binarySearch(arr,7);
		System.out.println(binarySearch(arr,7));
		
		 
		
	}

}
