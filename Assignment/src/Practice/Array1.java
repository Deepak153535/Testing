package Practice;

public class Array1 {

	public static void main(String[] args) {
		
		int[] a= {6,7,8,28,19};
		
		for(int i=0;i<a.length;i++)
		{
			if((a[i]%3==0)||(a[i]%14==0))
			{
				System.out.print(" "+a[i]);
			}
		}
		
	}
}
