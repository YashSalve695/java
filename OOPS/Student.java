package OOPS;

public class Student {

	private int age;
	private String name;
	private int rollNo;
	
	
	public int getAge() {
		 return age;
	 }
	
	public String getNamed() {
		return name;
	}
	
	public void setAge(int age) {
		if(age >= 20) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("You are not eligible to vote");
		this.age = age;
	}
	 }

	public void rollNo(int i) {
		
		
	}
}
