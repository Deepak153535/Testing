package Array;

public class Program1 {


	public static void main(String[] args) {
		
		
		int [] a= {2,5,8,3,5,2,9,7};
		int []b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*a[i];
		}
		for(int i:b)
		{
			System.out.println(i);
		}
		
	}
	
	
}
