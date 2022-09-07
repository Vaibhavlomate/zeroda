package Parameter;

public class Method_With_Parameter_Using_Static {
	public static void main(String[] args) {
		
		abhishek(50,50);
		vaibhav(10,10);
		studentInfo("vaibhav", 100, 'A', 99.99);
	}
		
		public static void abhishek(int a ,int b) {
			int c=(a+b);
			System.out.println(c);
		}
		
		public static void vaibhav(int a ,int b) {
			int multiplication=(a*b);
			System.out.println(multiplication);
		}
		
		public static void studentInfo(String sname, int rollno, char sGrade, double sPer) {
			System.out.println(sname);
			System.out.println(rollno);
			System.out.println(sGrade);
			System.out.println(sPer);
		}
		
}