package Practice;

public class Program99 {
//99.WAP TO INSERT THE VALUE TO THE SPECIFIED INDEX FOR AN EXISTING ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int[]a= {1,3,4,5,7,9};
		
		a[1]=10;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
