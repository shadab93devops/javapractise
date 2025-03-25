package collectionp;
import java.util.*;
import java.util.Map.Entry;
public class MapP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,Integer> m=new HashMap<>();
		
		m.put("shadab", 1);
		m.put("rumaisa", 22);
		m.put("ruhi", 29);
		m.put("sana", 38);
		m.put("sana", 38);
		System.out.println(m);
		
		m.replace("sana",38,101);
		
		System.out.println(m);
	
		m.putIfAbsent("ruhi",29);
		System.out.println(m);
		
		System.out.println(m.containsKey("ruhi"));
System.out.println(m.containsValue(99));
	 System.out.println(m.isEmpty());
	





	 
	
	
	
	
	
	
	
	
	}

}
