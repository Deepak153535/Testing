package Practice;

public class Program88 {

	//88.WAP TO FIND LARGEST ELEMENT IN AN ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int []a= {1,2,4,2,1,5,7,4,9,3};
		
		int big=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		System.out.println("big element is : "+big);
	}
}
