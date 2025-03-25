package collectionp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List l=new ArrayList();
	
	l.add("dog");
	
	l.add("cat");
	
	l.add("tiger");
	
	l.add("lion");
	
	l.add("elephant");
	
	
	
	System.out.println(l);
	
	
	
ListIterator itr = l.listIterator();

System.out.println("***********");
while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}


	}

}
