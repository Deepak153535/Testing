package Assignment;

import java.util.Scanner;

public class Program2 {

	//2.WAP TO CHECK WHETHER THE PERSON IS ELIGIBLE TO MARRY OR NOT.
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if(age>=21)
		{
			System.out.println("Male marrige age");
		}
		else
		{
			System.out.println("Not marry");
		}
		
		
	}
}
