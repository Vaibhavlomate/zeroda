package Try_Catch;

public class Arithmetic_Exception {
public static void main(String[] args) {
		
		int a=1;
		int b=0;
	
		try {
			int c=(a/b);
		}
		catch(ArithmeticException g) {
			System.out.println("idiot.....! enter vaid denomenator");
		}
	}




}
