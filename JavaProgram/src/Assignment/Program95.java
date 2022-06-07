package Assignment;

public class Program95 {

	//95.WAP TO FIND MAXIMUM ELEMENT IN ODD INDEX VALUE.
	
	public static void main(String[] args) {
		
		int[] a= {2,5,7,9,3,2,1,5,8,0};
		
		int min=a[0];
		for(int i=1;i<a.length;i=i+2)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Odd index minimum number is : "+min);
	}
}
