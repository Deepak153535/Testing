package Practice;

public class Program129 {
//129.FIND THE DUPLICATE CHARACTER PRESENT IN THE STRING.
	
	public static void main(String[] args) {
		
		String s="java is best";
		
		char[] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)	
			{
				if(a[i]!=a[j])
				{
					System.out.print(a[i]);
					break;
				}
			}
		}
		
	}
}
