package collectionp;

import java.util.LinkedList;

public class LinkedLsitP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		
		
		l.addFirst(100);
		
		l.addLast(200);
		
		
		System.out.println(l);
		System.out.println(l.getLast());
		System.out.println(l);
		
	}

}
