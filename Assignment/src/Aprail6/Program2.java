package Aprail6;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		String[] a=new String[4];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name : ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextLine();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
