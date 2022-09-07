package Collection;

import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
	
	LinkedHashSet lhs=new LinkedHashSet ();
	
	lhs.add("rainbow");
	lhs.add('A');
	lhs.add(null);
	lhs.add(null);
	lhs.add(100);
	
	
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.contains(null));
	
   
	
	
}
}
