package Assignment;

import java.util.Scanner;

public class Program5 {

	//5.WRITE ONE PROGRAM FOR NESTED IF,else if Ladder->IN CLASS
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number =s.nextInt();
		
		if(number==8)
		{
			System.out.println("Good Morning");
			if(number>=12 && number<=18)
			{
				System.out.println("Good Evening");
			}
			else
			{
				System.out.println(" Everyone");
			}
			
		}
		else
		{
			System.out.println("Hi");
		}
		
	}
}
