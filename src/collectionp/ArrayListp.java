package collectionp;
import java.util.*;
public class ArrayListp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList arr=new ArrayList();
		for(int i=0;i<10;i++) {
			arr.add(i);
		}
		
		
		System.out.println(arr);
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			
			int i=(int) itr.next();
			
			
			if(i%2==0) {
				itr.remove();
			}
			
		}
		
		System.out.println(arr);
		
		
	}

}
