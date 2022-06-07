package Array;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,10};
		
		int n=a.length;
		
		int d=((n+1)*(n+2))/2;
		//System.out.println(d);
		for(int i=0;i<a.length;i++)
		{
			d-=a[i];
			System.out.println(a[i]);
		}
		System.out.println(d);
	}
}
