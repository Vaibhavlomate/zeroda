package Reverse;

public class Name {
	public static void main(String[] args) {
		
		String org= "vaibhav";
		String rev= "";
		
		for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);
		}
			System.out.println(rev);
		
			
			if (org.equals(rev)) {
		System.out.println("given String is pallindrum");
			}
			
			else { 
				System.out.println("given String is not pallindrum");
			}			
	}
}

	  
	  
  
		
			
			
			
	


