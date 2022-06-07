package Practice;

public class Program80 {

//80.WAP TO PRINT THE EVEN ARRAY ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		
		int[]a= {2,3,4,6,7,4,2,1,7};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
