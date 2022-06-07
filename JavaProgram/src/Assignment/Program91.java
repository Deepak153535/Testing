package Assignment;

public class Program91 {

	//91.WAP TO PRINT ODD INDEX VALUES.
	
	public static void main(String[] args) {
		
		int[] a= {1,3,5,8,4,2,1};
		
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
