package oops;

public class This {
	This(){
		this(10);
		System.out.println("no args constructor");
		
	}

This(int i){
	System.out.println("one arg constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This obj=new This();
		
		
	}

}
