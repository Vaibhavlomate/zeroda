package Try_Catch;

public class Vegalach_Exception_Try_Kela {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch (Throwable g) {
			System.out.println("idiot.! enter the vaid denomenator");
		}
		finally {
			System.out.println("thank you for using ATM");
		}
	}

}
