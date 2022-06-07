package March28;

public class Program128 {

	//128.WAP TO CONVERT LOWER TO UPPERCASE WITHOUT USING INBUILT METHOD.
	
	public static void main(String[] args) {
		
		String s="JAVA";
		
		char[] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			char n=a[i];
			int b=(int)n;
			int c=b+32;
			char e=(char)c;
			
			System.out.print(e);
		}
	}
}
