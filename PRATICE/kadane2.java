package PRATICE;

public class kadane2 {
	
	public static int Maxsubbaray(int []nums) {
		
		int max_sum = Integer.MIN_VALUE;
		int current = 0;
		
		    for(int i = 0; i < nums.length; i++) {
		    	current += nums[i];
		    	max_sum = Math.max(current,max_sum);
		    	
		    	if(current < 0) {
		    		current = 0;
		    	}
		    }
		    return max_sum;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		System.out.println(Maxsubbaray(arr));
		
	}

}
