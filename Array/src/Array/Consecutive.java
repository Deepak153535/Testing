package Array;

public class Consecutive {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			int b=0;
			for(int j=i+1;j<a.length;j++)
			{
			b=a[i]+a[j];
			System.out.println(b);
			break;
			}
			//.out.println(b);
		}
	}
}
