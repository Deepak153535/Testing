package Assignment;

import java.util.HashSet;

public class SortedArray2 {

	public static void main(String[] args) {
		
		HashSet b=new HashSet();
		int[]a= {2,4,6,4,3,2,1,4,7};
		for(int i=0;i<a.length;i++)
		{
			b.add(a[i]);
		}
		
		for(Object i:b)
		{
			System.out.println(i);
		}
	}
}
