package ParameterizedMethod;

import java.util.Scanner;

public class Program3 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the neumber");
		int a=s.nextInt();
		
		if(a>0)
		{
			System.out.println("positive number");
		}
		else if(a<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("numbe is zero");
		}
	}
}
