package ParameterizedMethod;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		
		prime(a);
	}
	public static void prime(int a)
	{
		int temp;
		for(int i=2;i<=a;i++)
		{
			temp=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.println(i+" ");
			}
		}
	}
}
