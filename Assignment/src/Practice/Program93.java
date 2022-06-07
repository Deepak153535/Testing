package Practice;

public class Program93 {
//93.WAP TO CALCULATE SUM OF ODD INDEX VALUES.
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
			
		}
		System.out.println("sum of odd index number is : "+sum);
	}
}
