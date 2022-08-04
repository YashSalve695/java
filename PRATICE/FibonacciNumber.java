package PRATICE;

import java.util.*;

public class FibonacciNumber {
	
	   static long nthFibonacci(long n){
	       
	       long mod=1000000007; // 10^7
	       long a=0;
	       long b=1;
	       
	       if(n==1)
	        return a;
	       if(n==2)
	        return b;
	        
	       long c=0;
	       
	       for(int i=2;i<=n;i++){
	           c=(a+b)%mod;
	           a=b; // a will be at b now
	           b=c; // b will be at c now
	       }
	       return c;
	       
	   }
	
    // private static 
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long res = nthFibonacci(n);
		 System.out.println(res);
		
	}

}
