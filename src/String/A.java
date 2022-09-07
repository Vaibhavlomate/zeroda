package String;

public class A {
	public static void main(String[] args) {
		
		String s1=("velocity");
		String s2=("VELOCITY");
		String s3=("velo");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));   //5
		
		System.out.println(s1.contains(s2));     //6
		System.out.println(s1.contains(s3));
		System.out.println(s3.contains(s1));
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('v'));   //8
		
		System.out.println(s1.lastIndexOf('t'));
		
		System.out.println(s1.startsWith("ve"));
		System.out.println(s1.startsWith("vy"));    //10
		
		System.out.println(s1.endsWith("ty"));
		System.out.println(s1.endsWith("it"));       //11
		
		System.out.println(s1.substring(6));
		System.out.println(s3.substring(0));
		
		System.out.println(s1.concat(s3));
		
		System.out.println(s1.replace("city","rural"));
		System.out.println(s1.replace("velo","rural"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
