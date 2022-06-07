package Assignment;

public class Program127 {

	//127.WAP TO CONVERT UPPERCASE TO LOWER CASE WITHOUT USING INBUILT METHOD.->IN CLASS
	
	public static void main(String[] args) {
		
		String s="java by keeran";
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			char n=c[i];
			
			int a=(int)n;
			int b=a-32;
			char e=(char)b;
			
			System.out.println(e);
		}
		
	}
}
