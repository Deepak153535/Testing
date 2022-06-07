package Assignment;

public class Program117 {

	//117.  wap to find the biggest consecutive sum in arrayin array element.
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int b=a[i]+a[j];
				if(big<b)
				{
					big=b;
				}
				
			}
		}
		System.out.println("Big cosecutive number is : "+big);
	}
}
