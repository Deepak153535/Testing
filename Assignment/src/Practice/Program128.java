package Practice;

public class Program128 {

	//128.WAP TO CONVERT LOWER TO UPPERCASE WITHOUT USING INBUILT METHOD.
	
	public static void main(String[] args) {
		
		String s="java is best";
		
		char[]a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			char c=a[i];
			int b=(int)c;
			int d=b-32;
			char e=(char)d;
			
			System.out.print(" "+e);
		}
	}
}
