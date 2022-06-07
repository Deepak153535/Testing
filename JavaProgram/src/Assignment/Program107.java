package Assignment;

public class Program107 {

	//107.WAP TO FIND THE SECOND SMALLEST ELEMENT IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int[]a= {5,4,3,2,5,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("Find Second Largest Number is : "+a[1]);
		
	}
}
