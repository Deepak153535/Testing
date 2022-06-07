package Assignment;

public class Program93 {

	//93.WAP TO CALCULATE SUM OF ODD INDEX VALUES.
	
	public static void main(String[] args) {
		
		int[] a= {3,2,1,5,7,8,9};
		
		int sum=0;
		for(int i=1;i<a.length;i=i+2)
		{
			sum=sum+a[i];
			
		}
		System.out.println("odd sum is : "+sum);
	}
}
