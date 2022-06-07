package Assignment;

public class Program82 {

	//82.WAP TO PRINT ODD ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[] n= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==1)
			{
				System.out.println(n[i]);
			}
		}
	}
}
