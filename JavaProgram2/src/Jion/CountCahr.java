package Jion;

public class CountCahr {

	public static void main(String[] args) {
		
		String s="java c";
		
		int count=0;
		char[] c=s.toCharArray();
		for(int i:c)
		{
			count++;
		}
		System.out.println("count char : "+count);
	}
}
