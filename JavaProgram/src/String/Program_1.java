package String;

public class Program_1 {

	//1) Java Program to count the total number of characters in a string
	
	public static void main(String[] args) {
		
		String s="java is best";
		
		int count=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				count++;
			//System.out.print(c[i]);
			}
		}
		System.out.println(count);
	}
}

