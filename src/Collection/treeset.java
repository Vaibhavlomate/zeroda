package Collection;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
	
	TreeSet ts=new TreeSet ();
	
	ts.add(100);
	ts.add(50);
	ts.add(10);
	ts.add(100);
	
	
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	System.out.println(ts.contains(1));
	
	ts.remove(100);
	System.out.println(ts);
	
	
	
	
	
}
}
