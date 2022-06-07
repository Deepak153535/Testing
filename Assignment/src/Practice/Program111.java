package Practice;

public class Program111 {

	//111.WAP TO PRINT THE DUPLICATE ELEMENTS IN AN ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {2,4,5,6,8,9,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
