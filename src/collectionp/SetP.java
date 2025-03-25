package collectionp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set s=new HashSet();
		Set s=new TreeSet();
		s.add(20);
		s.add(30);
		s.add(50);
		s.add(40);
		s.add(10);
		
	
		System.out.println(s);
		
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
