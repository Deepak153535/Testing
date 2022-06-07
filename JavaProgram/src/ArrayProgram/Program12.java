package ArrayProgram;

public class Program12 {

	public static void main(String[] args) {
		boolean b=false;
		int[] a= {2,5,8,3,5,2,9,7};
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
