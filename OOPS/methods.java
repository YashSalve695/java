package OOPS;

public class methods {

	public static void main(String[] args) {
	
//	int first = 1;
//	int second = 76;
	
	 int result = swap(34,45);
		
	System.out.println(result);	
		
		
}
// static int maxOf(int a,int b) {
//	if(a > b) {
//		return a;
//	}else {
//		return b;
//	}
	
	static int swap(int f,int g) {
		int temp = f;
		f = g;
		 g = temp;
		 return temp;
	
}

}