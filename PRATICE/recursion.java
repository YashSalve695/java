package PRATICE;

import java.util.*;

public class recursion {
	
	public static void printdec(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		  printdec(n - 1);
	}

	public static void printinc(int n) {
		 
		if(n == 0) {
			return;
		}
		printinc(n - 1);
		System.out.println(n);
	}
	
	public static int factorial(int n) {

		if(n == 1) {
			return 1;
		}
		int fact1 = factorial(n - 1);
		int fact2 = fact1 * n;
		
		return fact2;
	}
	
    public static int power(int x,int n) {
	 
    	  if(n == 0) {
    		  return 1;
    	  }
    	  int xn = power(x,n - 1);
    	  int x2 = x * xn;
    	  
    	  return x2;
	}

    public static void toh(int n,int t1,int t2,int t3) {
    	
    	if(n == 0) {
    		return;
    	}
    	toh(n - 1,t1,t3,t2);
    	  System.out.println(n + "[" + t1 + " -> " + t2 + "]");
    	  toh(n - 1,t3,t2,t1);  
    }
 
    public static int firstindex(int arr[],int index,int x) {
    	
    	if(index == arr.length) {
    		return -1;
    	}
    	int search = firstindex(arr,index + 1,x);
    	   if(arr[index] == x) {
    		   return index;
    	   } else {
    		   return search;
    	   }
    }
    
    public static ArrayList<String> getsubseq(String str){
    	
    	if(str.length() == 0) {
    		ArrayList<String> bres = new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	char ch = str.charAt(0);
    	String ros = str.substring(1);
    	
    	ArrayList<String> result = getsubseq(ros);
    	ArrayList<String> myresult = new ArrayList<>();
    	  
    	    for(String recursion : result) {
    	    	myresult.add("" + recursion);
    	    	myresult.add(ch + recursion);
    	    }
    	    return myresult;
    }
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    //	int n = sc.nextInt();
	//	int arr[] = new int[n];
	//	  for(int i = 0; i < arr.length; i++) {
	//		  arr[i] = sc.nextInt();
		  
	
	//	int t1 = sc.nextInt();
	//	int t2 = sc.nextInt();
	//	int t3 = sc.nextInt();
	//	printdec(n);
	//	printinc(n);
	//	int res = factorial(n);
	//	System.out.println(res);
	//	int pow = power(n,m);
	//	System.out.println(pow);
	//	toh(d,t1,t2,t3);
		
	//	int find = firstindex(arr,0,2);
	//	 System.out.println("ELEMENT FOUND AT INDEX " +  find);
		  
		 String str = sc.next();
		 ArrayList<String> res = getsubseq(str);
		 System.out.println(res);
	
		 List<Integer> odd = new ArrayList<>();
		 
		 Collections.sort(odd);
		
		 
		 
		 
    }
}
