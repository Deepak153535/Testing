package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int s=0;s<=i;s++)
			{
				System.out.print(" ");
			}
			for(int c=5;c>=i;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
