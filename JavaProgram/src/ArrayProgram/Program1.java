package ArrayProgram;
//Print Duplicate Array .


public class Program1 {

	public static void main(String[] args) {
		
		
		int a[]={2,3,4,5,6,7,7,6,};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
