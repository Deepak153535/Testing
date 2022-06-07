package ParameterizedMethod;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int year =s.nextInt();
		
		year(year);
	}
	public static void year(int a)
	{
		if((a%4==0 && a%100!=0)||(a%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not a leap yaer");
		}
	}
}
