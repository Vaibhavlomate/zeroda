package Logical_Programs;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {

		int year;

		Scanner s=new Scanner(System.in);

		System.out.println("Enter the year you want to check leap yera : ");

		year=s.nextInt();

		if(year%4==0 || year%400==0)
		{
		System.out.println(year+" is leap year");
		}
		else
		{
		System.out.println(year+" is not leap year");
		}

		}
		}


