package Return;

import java.util.Scanner;

public class PrimeNumber {


	public static void main(String[] args) {
		
		System.out.println(prime());
		
	}
	public static int prime()
	{
		int num=2;
		int count;
		int m=num/2;
		int c=0;
				if(num==0||num==1 )
				{
					System.out.println("not Prime");
				}
				else
				{
					for(int i=2;i<=num;i++)
					{
						if(num%i==0)
						{
							System.out.println("not Prime");
						c=1;
						break;
						}
					}
				}
				if(c==0)
				{
					System.out.println("Prime");
				}
			
		return num;
			
	}
}
