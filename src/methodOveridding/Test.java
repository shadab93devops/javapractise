package methodOveridding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal obj=new Animal();
obj.sound();


Animal obj1=new Dog();
obj1.sound();
obj1.hi();

Animal obj2=new Cat();
obj2.sound();
	}

}
