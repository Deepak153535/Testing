package Practice;

public class Program82 {
//82.WAP TO PRINT ODD ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a= {3,2,1,5,6,8,9,7,5};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
