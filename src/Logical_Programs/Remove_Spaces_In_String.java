package Logical_Programs;

public class Remove_Spaces_In_String {
public static void main(String[] args) {
	
	String str=("java is my favorite subject");
	String result=str.replaceAll("\\s", "");
	System.out.println(result);
}
}
