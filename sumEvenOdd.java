import java.util.Scanner;

public class sumEvenOdd {

	public static void main(String[] args) {
		
		System.out.println("ENTER YOUR NUMBER");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rem = n % 2;
		if(rem == 0) {
			int sum = n + n;
			System.out.println(sum);
		}
		
		System.out.println("ENTER YOUR NUMBER");
	}
	System.out.println("ENTER YOUR NUMBER");
}
