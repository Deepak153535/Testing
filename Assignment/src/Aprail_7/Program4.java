package Aprail_7;

public class Program4 {

	public static void main(String[] args) {
		
		int[] a={10,20,30,40,50,60};
		int big =a[2];
		
		for(int i=0;i<a.length;i++)
		{
			if(big<
					a[i])
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}
}
