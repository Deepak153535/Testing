package Assignment;

public class Program90 {

	//90.WAP TO PRINT EVEN INDEX VALUES IN AN ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {6,4,3,2,1,9,8,6,5};
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
