package Assignment;

import java.util.Scanner;

public class Program1 {

	//1.WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT.
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number : ");
	int number=s.nextInt();
	
	if(number==0)
	{
		System.out.println("Number is Hole");
	}
	else if(number>0)
	{
		System.out.println("Number is Positive");
	}
	{
		System.out.println("Number is Negative");
	}
}
	
	
}
