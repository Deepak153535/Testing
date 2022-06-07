package Assignment;

public class Program113 {

	//113.wap to find how many times the value is duplicated.
	
	public static void main(String[] args) {
		
		int[] a= {2,3,5,7,8,9,1,2,3};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[i]);
				}
			}
			
		}
		System.out.println("Duplicate : "+count);
		
	}
}
