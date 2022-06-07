package Practice;

public class Program96 {
//96.WAP TO CALCULATE AVERAGE OF ALL ARRAY ELEMENTS.
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,5,6,7,8};
		
		int c=a.length;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Average is : "+sum/c);
		
	}
}
