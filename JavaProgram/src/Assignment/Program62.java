package Assignment;

public class Program62 {

	//62.WAP TO CHECK WHETHER NUMBER IS PRIME NO OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=5;
		int count;
		for(int i=1;i<=n;i++)
		{
			 count=0;
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" Prime");
			}
			else
			{
				System.out.println(i+" Not Prime");
			}
		}
	}
}
