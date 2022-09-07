package Logical_Programs;

public class Print_Multiplication_of_values_Fr_1To_10 {
public static void main(String[] args) {
	
	int num=10;
	int product=1;
	for(int i=1;i<=num;i++) {
		product =product*i;
	}
	System.out.println(product);
}
}
