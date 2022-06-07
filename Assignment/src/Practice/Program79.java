package Practice;

public class Program79 {
//79.WAP TO PRINT ARRAY ELEMENTS IN REVERSE ORDER.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {2,4,6,3,2,4,6,9,7};
		
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
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
