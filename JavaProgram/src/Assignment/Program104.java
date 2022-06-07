package Assignment;

public class Program104 {

	//104.WAP TO SORT AN ARRAYELEMENT IN DESCENDING ORDER.
	
	public static void main(String[] args) {
		
		int[]a= {1,3,4,2,9,5,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
