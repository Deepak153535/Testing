package Array;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		
		int totalPrice=0;
		
		char c=' ';
		do {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the bottel price : ");
		int price=s.nextInt();
		
		System.out.println("Enetr the number of bottel : ");
		int numberOfBottel=s.nextInt();
		
		int result=total(price,numberOfBottel);
		System.out.println(result);
		totalPrice=totalPrice+result;
		System.out.println("have other calculation click y or n");
		
		c=s.next().charAt(0);
		}while(c=='y');
		System.out.println("Total Amount is : "+totalPrice);
	}
	
		public static int total(int price, int numberOfBottel)
		{
			int total=price*numberOfBottel;
			return total;
		}
		
}
