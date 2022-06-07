package Assignment;

public class Program80 {

	//80.WAP TO PRINT THE EVEN ARRAY ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,4,6,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
