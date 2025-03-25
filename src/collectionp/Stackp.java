package collectionp;

import java.util.Stack;

public class Stackp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack s=new Stack();
		s.push("lion");
		s.push("tiger");
		s.push("cat");
		s.push("dog");
		s.push("rat");
		
		
		System.out.println(s);
		s.pop();
		System.out.println(s.peek());
		System.out.println(s.search("tiger"));
		
		System.out.println(s);
	}

}
