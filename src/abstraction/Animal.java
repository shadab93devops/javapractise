package abstraction;

public abstract class Animal {
	Animal(){
		System.out.println("animal constructor");
	}
	int a=10;
	static int b=20;
	public abstract void noOfLegs();
	
	public void eat() {
		System.out.println("eating");
	}
	public static void sleep() {
		System.out.println("zzzz");
	}
}
