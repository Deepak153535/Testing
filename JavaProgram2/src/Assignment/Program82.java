package Assignment;

public class Program82 {

	//82.WAP TO PRINT ODD ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
