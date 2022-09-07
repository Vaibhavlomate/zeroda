package Logical_Programs;

public class Reverse_Number {
public static void main(String[] args) {
	
	int num=1234;
	int rev=0;
	for(int i=num;i>0;i=i/10) {
		int rem=i%10;
	rev=rev*10+rem;
	}
	System.out.println(rev);
	if(num==rev) {
		System.out.println("giver no is pallindrome");
	}
	else {
		System.out.println("given number is not pallindrome");
	}
}
}
