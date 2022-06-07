package Practice;

public class Program105 {
//105.WAP TO FIND THE SECOND LARGEST ELEMENT  IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[]a= {3,2,4,6,7,8,4,1};
		
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
			System.out.println(a[1]);
			break;
		}
	}
	
}
