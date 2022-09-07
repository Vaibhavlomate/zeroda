package Super_Keyword;

public class Sample2 extends Sample1 {
	int a=60;
	
	public void test() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}

}
