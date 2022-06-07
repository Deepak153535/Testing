package Assignment;

public class Program110 {

	//110.WAP TO DESIGN A METHOD TO SORT ARRAY ELEMENTS IN DESCENDING ORDER.AND RETURN SORTED ARRAY.
	
	public static void main(String[] args) {
		
		int a=test();
		System.out.println("Print : "+a);
	}
	public static int test()
	{
		int[]a= {1,3,5,3,2,7,9};
		
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
		int sum=0;
		for(int i:a)
		{
			sum=sum*10+i;
		}
		return sum;
	}
}
