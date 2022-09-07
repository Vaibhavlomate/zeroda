package Collection;

import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args) {
	
	LinkedList ll=new LinkedList ();
	
	ll.add("Ankush");
	ll.add('D');
	ll.add("Avantika");
	ll.add(100);
	ll.add("Ankush");
	ll.add(null);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.contains("avantika"));
	System.out.println(ll.get(0));
	
	ll.add(2, "rahul gandhi");
	System.out.println(ll);
	
	ll.remove(2);
	System.out.println(ll);
	
    ll.set(0, "Ankush kumar");
    System.out.println(ll);
	
	
}
}
