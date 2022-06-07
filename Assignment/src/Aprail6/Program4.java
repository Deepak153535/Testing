package Aprail6;

import java.util.Scanner;

import Aprail_2.A;

public class Program4 {

	static int[] creatArray(int size)
	{
		int [] a=new int[size];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		return a;
	}
	public static void main(String[] args) {
	
		int[] x=creatArray(4);
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}
