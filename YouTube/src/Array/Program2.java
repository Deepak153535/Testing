package Array;

public class Program2 {

	public static void main(String[] args) {
		
		int [] a= {2,5,8,3,5,2,9,7};
		int [] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					b[i]=a[i];
					
				}
			}
		}
		for(int i:b)
		{
			System.out.println(i);
		}
	}
}
