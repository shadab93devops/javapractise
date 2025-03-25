package collectionp;
import java.util.*;
public class ComparearrayListTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	HashMap<String,Integer> m=new HashMap<>();
	m.put("apple", 1);
	m.put("mango", 2);
	m.put("banana",3);
	
	m.put(null, null);
	m.put("pip", null);
	m.put("banana", 88);
	
	System.out.println(m);
	System.out.println(m.get("apple"));
	
	System.out.println(m.keySet());
	System.out.println(m.values());
	
	
	Set<String> key=m.keySet();
	
	
	for(String k:key) {
		System.out.println(k);
	}
	
	
	Collection<Integer>val=m.values();
	
	for(Integer v:val) {
		System.out.println(v);
	}
	}

}
