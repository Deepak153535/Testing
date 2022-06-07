package Program;

import java.util.Scanner;

public class Program1 {

	//1.WAP TO CHECK WHETHER NUMBER IS POSITIVE OR NOT.
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Not Positive ");
		}
		
	}
}
