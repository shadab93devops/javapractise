package interface1;

public interface Animal {

	public static final int a=10;
	
	
	int b=90;
	public static void info() {
		System.out.println("interface static method");
	}
	
	
	public default void run() {
		this.sleep();
		System.out.println("default method");
	}
	public abstract void sleep();
	public abstract void eat();
	
	
	
	
}
