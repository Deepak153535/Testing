package Assignment;

public class Program98 {

	//98. WAP TO COPY THE ARRAY ELEMENTS IN REVERSE ORDER AND PRINT IT.
	
	public static void main(String[] args) {
		
		int[] a= {3,2,4,5,7,8};
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum=sum*10+a[i];
		}
		int s=0;
		while(sum>0)
		{
			int rem=sum%10;
			s=s*10+rem;
			sum=sum/10;
		}
		System.out.println(s);
	}
}
