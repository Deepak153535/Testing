package Practice;

public class Program103 {
//103.WAP TO SORT AN ARRAYELEMENT IN ASCENDING ORDER.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {1,0,3,9,5,6,7,8};
		
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
