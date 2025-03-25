package collectionp;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class RemoveduplicateFromArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(10);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		System.out.println(arr);
		
//		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>(arr);
//		System.out.println(link);
//		
//		ArrayList al=new ArrayList<>(link);
//		System.out.println(al);
		
		List<Integer> m=arr.stream().distinct().collect(Collectors.toList());
		
		System.out.println(m);
		
		
	}

}
