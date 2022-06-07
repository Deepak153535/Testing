package Assignment;

import java.util.Scanner;

public class Program4 {

	//4.WAP TO DISPLAY MESSAGE GOOD MORNING WHEN NUMBER IS 8 AND NUMBER EQUALS TO 10 AND NUMBER EQUALS TO 11.
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number is : ");
		int time=s.nextInt();
		
		if(time>=8 && time<=11)
		{
			System.out.println("Good Morning");
		}
		
		
	}
}
