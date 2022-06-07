package Practice;

public class Program115 {

	//115.wap to find missing element in an array.
	
	public static void main(String[] args) {
		
		int[]a= {1,2,4,5,6,7,8};
		
		int n=a.length;
		int sum=0;
		
		sum=((n+1)*(n+2))/2;
		
		for(int i=0;i<n;i++)
		{
			sum-=a[i];
		}
		System.out.println(sum);
	}
}
