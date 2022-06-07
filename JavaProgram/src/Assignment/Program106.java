package Assignment;

public class Program106 {

	//106.CREATE A METHOD AND SORT ARRAYELEMENTS.->IN CLASS
	
	public static void main(String[] args) {
	
		int[]a= {1,14,5,3,32,13,7};
		test(a);
	}
	public static void test(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
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
