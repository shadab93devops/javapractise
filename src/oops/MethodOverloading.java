package oops;

public class MethodOverloading {
	
	public  void add(int a) {
		System.out.println("one parameter");
	}
	

	public void add(int a,double b) {
		System.out.println("two parameter");
	}

	public  void add(double a,int b) {
		System.out.println("three parameter");
	}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.add(90,10.0);
}
}
