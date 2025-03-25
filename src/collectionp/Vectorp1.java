package collectionp;
import java.util.*;
import java.util.Map.Entry;
public class Vectorp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String ,Integer> m=new TreeMap<>();
		m.put("abc", 1);
		m.put("xyz", 11);
		m.put("ruhi", 21);
		m.put("rumaisa", 31);
		m.put("sadaf", 41);
		m.put("null",null);
		
		System.out.println(m);
Set<String>	keys=	m.keySet();
		System.out.println(keys);
		
Collection<Integer>	v=	m.values();

System.out.println(v);



Set<Entry<String,Integer>>e=m.entrySet();
		System.out.println(e);
		
		
		System.out.println(m.get("ruhi"));
		
		System.out.println(m.getOrDefault("jj",0));
		
		m.remove("abc");
		m.replace("xyz", 99);
		System.out.println(m);
		
	}

}
