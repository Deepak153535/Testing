package Practice;

public class Program84 {
//83.WAP TO CALCULATE SUM OF EVEN ELEMENTS IN AN ARRAY.
	
	public static void main(String[] args) {
		
		
		int[]a= {2,4,2,1,3,5,7,8,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
}
