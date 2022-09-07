package Collection;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList ();
		
		al.add("ganesh");
	    al.add(100);
	    al.add('A');
	    al.add(null);
	    al.add(100);
	    al.add(null);
	    
	    System.out.println(al);
	    
	    System.out.println(al.size());
	    
	    System.out.println(al.contains(100));
	    
	    System.out.println(al.isEmpty());
	    
	    
	    //right shift operator
	    al.add(2,200);              //2 no nantar 200 la add karnar
	    System.out.println(al);
	    
	    al.add(2,200);
	  System.out.println(al.get(7));  //7 no la je aahe te dakhavnar
	  
	  al.add(2,200);
	  System.out.println(al.get(2));
	    System.out.println(al);
	    
	   //left shift operator
	    
	    al.remove(0);
	    System.out.println(al);
	    
	    
	}

}
