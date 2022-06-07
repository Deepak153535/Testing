package ArrayProgram;

import java.util.Arrays;

public class Program20 {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,1,2,3,4};
		
		Arrays.sort(a);
		
		System.out.println(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
