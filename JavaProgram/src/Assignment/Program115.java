package Assignment;

public class Program115 {

	//115.wap to find missing element in an array.
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17};
		
		int n=a.length;
		System.out.println(n);
		
		int sum=((n+1)*(n+2))/2;
		
		for(int i=0;i<n;i++)
		{
			sum-=a[i];
		}
		System.out.println("Miss Element : "+sum);
		
	}
	
}
