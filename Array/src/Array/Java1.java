package Array;

import java.util.Scanner;

public class Java1 {

	
		public static void main(String[] args) {
			int totalPrice=0;
			for(int i=0; i<=100;i++)
			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enetr the bottel price : ");
				int price=s.nextInt();	
				
				System.out.println("Enetr the number of bottel : ");
				int numberOfBottel=s.nextInt();
				int total=price*numberOfBottel;		
				System.out.println("Total="+total);
				totalPrice=total+totalPrice;
				
				System.out.println("have other calculation click y or n");
				String Input=s.nextLine();
				if(Input.equalsIgnoreCase("y"))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			
			System.out.println("Complete Total Price="+totalPrice);
		}
		
	
}
