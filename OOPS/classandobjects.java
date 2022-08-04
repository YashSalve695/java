package OOPS;

  class Phone {
	String colour;
	String operatingSystem;
	int camera;
	int memory;
	
	public void camera() {
		System.out.println("Phone has " +3+  " camera");
	}
	public void operatingSystem() {
		System.out.println("Phone has latest operating system ");
	}
	public void colour() {
		System.out.println("Phone has " + colour + " colour");	
	}
	public void memory() {
		System.out.println("Phone has 16GB of memory");
	}

	}

// OBJECTS ARE ALWAYS KEPT IN HEAP MEMORY

public class classandobjects {

	public static void main(String[] args) {
		
		Phone samsung = new Phone();
          samsung.camera();
          samsung.memory();
	}


}