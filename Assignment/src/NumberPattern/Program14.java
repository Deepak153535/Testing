package NumberPattern;

public class Program14 {

    public static void main(String[] args) {
		
		int n=5;
		
		
		for(int i=0;i<n;i++)
		{
			char ch='A';
			
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(ch++%2+" ");
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
