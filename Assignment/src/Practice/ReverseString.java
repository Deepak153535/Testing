package Practice;

public class ReverseString {

	public static void main(String[] args) {

		String s = "java is best";

		String[] a=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			String r=a[i];
			char[] b=r.toCharArray();
			
			for(int j=b.length-1;j>=0;j--)
			{
				System.out.print(b[j]);
			}
			System.out.print(" ");
		}
	}
}
