package Assignment;

public class Program79 {

	//79.WAP TO PRINT ARRAY ELEMENTS IN REVERSE ORDER.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {2,1,443,2,21,21,3,4,34,6,7,8,4};
		
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
			System.out.println(a[i]);
		}
		
	}
}
