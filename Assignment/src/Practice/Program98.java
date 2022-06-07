package Practice;

public class Program98 {
//98. WAP TO COPY THE ARRAY ELEMENTS IN REVERSE ORDER AND PRINT IT.
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,6,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}
}
