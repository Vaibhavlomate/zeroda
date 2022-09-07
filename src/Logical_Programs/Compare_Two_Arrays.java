package Logical_Programs;

import java.util.Arrays;

public class Compare_Two_Arrays {
public static void main(String[] args) {
	int ar1[]= {10,20,50,60,90,80};
	int ar2[]= {50,60,70,80,90,82};
	int ar3[]= {10,20,50,60,90,80};
	
	System.out.println(Arrays.equals(ar1, ar2));
	System.out.println(Arrays.equals(ar1, ar3 ));
}
}
