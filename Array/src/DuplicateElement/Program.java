package DuplicateElement;

public class Program {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				//	System.out.println(a[j]);
				}
			}
		}
			for(int i=a.length-1;i>=0;i--)
			{
				System.out.println(a[i]);
			}
		
	}
}
