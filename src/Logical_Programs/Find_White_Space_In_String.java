package Logical_Programs;

public class Find_White_Space_In_String {
public static void main(String[] args) {
	 String name="V E L O C I T Y";
	 int count=0;
	 for(int i=0;i<=name.length()-1;i++) {
		 char ch=name.charAt(i);
		 if(ch==' ') {
			 count++;
		 }
	 }
	 System.out.println(count);
}
}
