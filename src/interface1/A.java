package interface1;

public interface A {
public abstract void hello();
public default void display() {
	System.out.println("a");
}
}
