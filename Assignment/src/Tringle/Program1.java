package Tringle;

public class Program1 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(i>=j)
				{
					System.out.print(i+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
