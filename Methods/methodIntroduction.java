package Methods;

public class methodIntroduction {
	
	import java.util.;
	
	static int maxOf(int a,int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		
		int firstNumber = 43;
		int secondNumber = 23;
		
		int result = maxOf( firstNumber, secondNumber);
 System.out.println(result);
	}

}
