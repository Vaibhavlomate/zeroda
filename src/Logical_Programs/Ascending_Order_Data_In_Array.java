package Logical_Programs;

import java.util.Arrays;

public class Ascending_Order_Data_In_Array {
public static void main(String[] args) {
	
    int ar[]= {90,45,60,20,30,10};
   // for(int i=0;i<=ar.length-1;i++) {
   // 	System.out.println(ar[i]);
   // }

    Arrays.sort(ar);
    for(int i=0;i<=ar.length-1;i++) {
    	System.out.println(ar[i]);
    }
    
}
}
