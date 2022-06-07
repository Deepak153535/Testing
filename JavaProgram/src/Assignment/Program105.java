package Assignment;

public class Program105 {

	//105.WAP TO FIND THE SECOND LARGEST ELEMENT  IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int a[]= {5,4,2,1,1,4,6,9};
		
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
		System.out.println(a[a.length-2]);
	}
}
