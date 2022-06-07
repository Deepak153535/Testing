package Assignment;

import java.util.Scanner;

public class Program_55 {


	public static void main(String[] args) {
		
		
		int[] a=test();
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
		
	}
	public static int[] test()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length ");
		int a=s.nextInt();
		
		int[] b= new int[a];
		
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		
		int[] r=new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			r[i]=b[i];
		}
		
		return r;
	}
	
}
