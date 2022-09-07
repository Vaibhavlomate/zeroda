package Parameter;

public class Method_With_Parameter_Using_Non_Static {
	public static void main(String[] args) {
		
		Method_With_Parameter_Using_Non_Static g =new Method_With_Parameter_Using_Non_Static();
		g.satpal(50,50);
		
		
	}
	
	public void satpal(int a , int b) {
		int sum=(a+b);
		System.out.println(sum);
	}

}
