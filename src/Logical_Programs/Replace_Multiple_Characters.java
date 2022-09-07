package Logical_Programs;

import java.util.Scanner;

public class Replace_Multiple_Characters {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the name");
	      String name = scan.next();
	      String actualName=name.replaceAll("[@#$!]", "");
	      System.out.println(actualName);
}
}
