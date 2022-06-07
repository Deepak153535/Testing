package March28;

public class P1 {

	public static void main(String[] args) {
		
		P1 p=new P1();
		
	System.out.println(p.mat(5));
		
		
	}
	int mat(int n)
	{
		int i,j,x;
		x=0;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				x=x*j;
			}
			
		}
		return x;
	}
}
