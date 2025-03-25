package oops;

public class Child  extends Parent{

private Child(){

	this(10);
	System.out.println("default constructor");

}
Child(int a){
	System.out.println("parameter constructor");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
	
		
		
		
		
	}

}
