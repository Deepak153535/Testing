package Practice;

public class Program90 {
//90.WAP TO PRINT EVEN INDEX VALUES IN AN ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int[]a= {1,3,5,6,4,3,5,8};
		
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}
}
