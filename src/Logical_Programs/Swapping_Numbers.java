package Logical_Programs;

public class Swapping_Numbers {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before swapping a:"+a);
	System.out.println("before swapping b:"+b);
	int c=a;
	a=b;
	b=c;
	System.out.println("after swapping a:"+a);
	System.out.println("after swapping b:"+b);
	System.out.println(a+b+c);
}
}
