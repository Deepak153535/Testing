package March16;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the mark");
		int mark3 =s.nextInt();
		
		int mark1=s.nextInt();
		int mark2=s.nextInt();
		int mark=(mark1+mark2+mark3)/3;
		if(mark1<=100&& mark2<=100&&mark3<=100)
		{
			if(mark1>=35&&mark2>=35&&mark3>=35)
			{
				if(mark>=35 && mark<50)
				{
					System.out.println("Just Pass");
				}
				else if(mark>=50 && mark<60)
				{
					System.out.println("Second Division");
				}
				else if(mark>=60 && mark<80)
				{
					System.out.println("Firt DIvision");
				}
				else if(mark>=80 && mark<100)
				{
							System.out.println("Distinction");
				}
			}
			else
			{
				System.out.println("ooo");
			}
		}
		else
		{
			System.out.println("Failed");
		}
	}
		
}
