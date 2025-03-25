package interface1;

public class C  implements A,B{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
	
	public static void main(String[] args) {
		C obj=new C();
		obj.hello();
		obj.display();
		
		
	}
	
	public  void display() {
		A.super.display();
	}

}
