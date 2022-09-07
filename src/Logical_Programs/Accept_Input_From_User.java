package Logical_Programs;

import java.util.Scanner;

public class Accept_Input_From_User {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 1st number");
	      int num1 = scan.nextInt();
	      
	System.out.println("enter the 2nd number");
	       int num2 = scan.nextInt();
	       
	       System.out.println("addition"+(num1+num2));
}
}
