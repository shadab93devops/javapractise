package collectionp;

import java.util.Enumeration;
import java.util.Vector;

public class VectorP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector v=new Vector();
		v.addElement("hi");
		v.addElement("bye");
		v.addElement("apple");
		
		
		
		
	System.out.println(v);
	
Enumeration e=	v.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}


	}

}
