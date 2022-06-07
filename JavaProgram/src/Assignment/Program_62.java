package Assignment;

public class Program_62 {

	//62.WAP TO CHECK WHETHER NUMBER IS PRIME NO OR NOT.->IN CLASS
	
	public static void main(String[] args) {
		
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(n+" Prime");
		}
		else
		{
			System.out.println(n+" Not prime");
		}
	}
}
