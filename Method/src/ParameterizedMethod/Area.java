package ParameterizedMethod;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		int l=s.nextInt();
		System.out.println("Enter Width");
		int w=s.nextInt();
		
		area(l,w);
	}
	public static void area(int a,int b)
	{
		int Area;
		Area=a*b;
		
		System.out.println("Area is : "+Area);	
	}
	
}
