package March30;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=s.nextInt();
		int count=0;
		
		int i=1;
		
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println(n+" Number is prime ");
		}
		else
		{
			System.out.println(n+ " Number is not prime");
		}
	}
}
