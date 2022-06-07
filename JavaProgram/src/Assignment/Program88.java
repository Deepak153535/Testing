package Assignment;

public class Program88 {

	//88.WAP TO FIND LARGEST ELEMENT IN AN ARRAY.->IN CLASS
	public static void main(String[] args) {
		
		int[] a= {1,3,7,4,2,9,5,3};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
		}
		System.out.println("Maximum is : "+max);
	}
}
