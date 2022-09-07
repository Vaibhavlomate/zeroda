package Logical_Programs;

public class Replace_By_String_Multiple_Characters {
public static void main(String[] args) {
	
	String s1="velo@#!$%city";
	String s2=s1.replaceAll("(@#!$%)", "");
	System.out.println(s2);
}
}
