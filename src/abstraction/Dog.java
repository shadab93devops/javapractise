package abstraction;

public class Dog  extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Dog();
		obj.noOfLegs();
		obj.eat();
		Animal.sleep();
		System.out.println(obj.a);
		System.out.println(Dog.b);
	}

	@Override
	public void noOfLegs() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	

}
