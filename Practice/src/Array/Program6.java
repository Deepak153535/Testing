package Array;

public class Program6 {

	//reverse order
	
	public static void main(String[] args) {
		
		int[]a={1,2,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);
		
		}
	
	}
}
