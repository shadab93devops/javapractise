package oops;

public class ClassPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		
		
		
		
		Person p2=new Person(30,"zara");
		
	System.out.println(p2.age + " "+ p2.name);
	}

}


class Person{
	String name;
	int age;
	
	public Person() {
		System.out.println("constructor");
	}
	
	public Person(int age,String name) {
		this();
		this.age=age;
		this.name=name;
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	void walking() {
		System.out.println(name + " is walking");
	}
	void walking(int steps) {
		System.out.println(name + " has taken " + steps);
	}
}