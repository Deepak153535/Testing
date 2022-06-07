package Practice;

public class Program127 {

	//127.WAP TO CONVERT UPPERCASE TO LOWER CASE WITHOUT USING INBUILT METHOD.->IN CLASS
	
	public static void main(String[] args) {
		
		String s="JAVA IS BEST";
		
		char[] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
			char n=a[i];
			int b=(int)n;
			int c=b+32;
			char d=(char)c;
			System.out.print(d);
			}
			else
			{
				System.out.print(" ");
			}
			
		}
	}
}
