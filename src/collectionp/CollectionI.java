package collectionp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c=new ArrayList();
		c.add(19);
		c.add(20);
		c.add("hi");
		c.add("hello");
		c.remove(19);
		System.out.println(c);
		
		
		
		
		Collection c2=new ArrayList();
		c2.addAll(c);
		c2.add("bye");
		
		System.out.println(c2);
		System.out.println(c.contains("hi"));
		System.out.println(c2.containsAll(c));
		
		System.out.println(c.size());
	Iterator itr=	c2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		
	}

}
