package Methods;

public class Non_Static_Regular_Methos_call_from_same_Class {
	public static void main(String[] args) {
		
		Non_Static_Regular_Methos_call_from_same_Class g=new Non_Static_Regular_Methos_call_from_same_Class();
		
		g.abhishek();
		g.vaibhav();
		g.satpal();
		
		
		
	}
	
	public void abhishek() {
		System.out.println("gone to farm");
	}
		
		public void vaibhav() {
			System.out.println("with abhishek");
		}
		
		public void satpal() {
			System.out.println("with abhishek and vaibhav");
			
		}
	

}
