package ParameterizedMethod;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		
		print(number);
	}
	public static void print(int a)
	{
		switch(a)
		{
		
		case 1:
		
			System.out.println("10");
			break;
			
		case 2:
			System.out.println("20");
			break;
		case 3 :
			System.out.println("30");
			break;
			
		case 4 :
			System.out.println("40");
			
			default :
					System.out.println("more than ");
		}
		
	}
}
