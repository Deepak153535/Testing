package Practice;

public class Program112 {
//112.wap to remove duplicate elements in an array.
	
	public static void main(String[] args) {
		
		int[]a= {2,1,3,4,5,6,7,8,2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	
	}
}
