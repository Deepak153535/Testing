package Assignment;

public class Program_127 {

	//String convert uppercase to lowercase case without using inbuilt method
	
	public static void main(String[] args) {
		
		String s="JAVA IS BEST";
		
		char[] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			char n=a[i];
			//System.out.print(n);
			int c=(int)n;
			//System.out.println(c);
			int b=c+32;
		//	System.out.println(b);
			char d=(char)b;
			
			System.out.print(d);
			
		}
	}
}
