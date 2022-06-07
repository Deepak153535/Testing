package Program;

import java.util.Scanner;

public class Program2 {

	//2.WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		
		if(n>=18)
		{
			System.out.println("Eligible to marry");
		}
		else
		{
			System.out.println("You are not eligible to marry");
		}
		
	}
}
