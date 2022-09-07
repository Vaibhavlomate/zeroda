package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectors {
public static void main(String[] args) {
	
	Vector v=new Vector ();
	
	v.add("Samantha");
	v.add('A');
	v.add(100);
	v.add(null);
	v.add(null);
	v.add("Samantha");
	
//	
//	System.out.println(v);
//	System.out.println(v.size());
//	System.out.println(v.contains(100));
//	System.out.println(v.isEmpty());
//	System.out.println(v.capacity());
//	System.out.println(v.get(0));
	
//	v.add(0, "Nagachaitanya");       //right shift operator
//	System.out.println(v);
//	
//	v.remove(0);
//	System.out.println(v);           //left shift operator
//	
//	v.set(1, 'B');
//	System.out.println(v);           //set operator
	
//	Iterator itr = v.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
//	Enumeration en = v.elements();
//	while(en.hasMoreElements()) {
//		System.out.println(en.nextElement());
//	}
	
	for(Object s1:v) {
		System.out.println(s1);
	}
	
	

	
}
}
