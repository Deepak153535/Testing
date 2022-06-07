package Assignment;

public class Program128 {

	//128.WAP TO CONVERT LOWER TO UPPERCASE WITHOUT USING INBUILT METHOD.
	
	public static void main(String[] args) {
		
		String s="java is best";
		
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=(int)n;
			int m=n-32;
			char c1=(char)m;
			
			System.out.print(c1);
		}
	}
}
