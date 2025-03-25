package interface1;

public interface B {
public abstract void hello();
public default void display() {
	System.out.println("b");
}
}
