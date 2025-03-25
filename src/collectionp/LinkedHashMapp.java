package collectionp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> m=new LinkedHashMap<String,Integer> ();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		System.out.println(m);
		
		Map<String,Integer> n=new TreeMap<String,Integer>();
		n.put("one", 1);
		n.put("two", 2);
		n.put("three", 3);
		n.put("four", 4);
		System.out.println(n);
		System.out.println(n.keySet());
		System.out.println(n.values());
		
		
	}

}
