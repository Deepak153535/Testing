package March16;

import java.util.Scanner;

public class SwitchCAse {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Mark");
		int mark=s.nextInt();
		
		switch(mark)
		{
		case 20:
			System.out.println("You are Fail");
			break;
		case 40:
			System.out.println("Work Hard");
			break;
		case 50:
			System.out.println("");
		}
	}
}
