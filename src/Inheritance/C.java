package Inheritance;

public class C  extends P{
	int i=10;
C(){
	super(10);
	System.out.println(this.i);
	System.out.println(super.i);
	System.out.println("child constr");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();


	}

}
