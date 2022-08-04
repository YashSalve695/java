package PRATICE;

public class ReverseAnArray {
	
public static void printArray(int a[]) {
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
			System.out.println();
		
	}
		
	
	public static void reverseArray(int arr[]) {
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		
		int a[] = {12,3,2,1,5,1};
		reverseArray(a);
		printArray(a);
	}

}
