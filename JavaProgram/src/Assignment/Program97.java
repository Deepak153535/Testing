package Assignment;

public class Program97 {

	// 97.WAP TO COPY THE ONE ARRAY ELEMENT INTO THE ANOTHER ARRAY.->IN CLASS

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 7, 8, 9, 6 };
		int[] b = new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int i:b)
		{
			System.out.println(i);
		}
	}
}
