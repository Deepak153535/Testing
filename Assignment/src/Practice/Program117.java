package Practice;

public class Program117 {
//117.  wap to find the biggest consecutive sum in arrayin array element.
	
	public static void main(String[] args) {
		
		int[]a= {2,1,4,5,6,7,8,9};
		
		int c=a[0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				c=a[i]+a[j];
				
				if(c<a[i])
				{
					c=a[i];
				}
			}
		}
		System.out.println(c);
		
	}
}
