package Practice;

public class Program107 {

	//107.WAP TO FIND THE SECOND SMALLEST ELEMENT IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[]a= {5,3,2,1,3,5,0,7,8,9};
		
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
			System.out.println(a[1]);
			break;
		}
	}
}
