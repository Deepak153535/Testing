package Assignment;

import java.util.Arrays;
import java.util.List;

public class Program92 {

	//92.WAP TO CALCULATE SUM OF EVEN INDEX VALUE.
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i+=2)
		{
			sum+=a[i];
		}
		
		System.out.println(sum);
		
	}
}
