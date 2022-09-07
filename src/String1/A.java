package String1;

public class A {
	public static void main(String[] args) {
		
		String s1= "velocity";
		String s2= "VELOCITY";
		String s3= "city";
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s3.toLowerCase());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.contains(s3));               //6 
		System.out.println(s2.contains(s3));
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.indexOf('e'));
		
		System.out.println(s1.lastIndexOf('v'));
		
		System.out.println(s1.startsWith("loci"));
		
		System.out.println(s1.endsWith("CITY"));
		
		System.out.println(s1.substring(5));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.replace("velocity", "vaibhav"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
