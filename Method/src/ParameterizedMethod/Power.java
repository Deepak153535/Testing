package ParameterizedMethod;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number  : ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b=sc.nextInt();
		
		power(a,b);
	}
	public static void power(int a,int b)
	{
		int pow=1;
		int i=1;
		
		while(i<=b)
		{
			pow=pow*a;
			i++;
		}
		System.out.println(a+ " power of " +b+" is  : "+pow);
	}
	
}
