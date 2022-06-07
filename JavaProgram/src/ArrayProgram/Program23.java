package ArrayProgram;

public class Program23 {

	public static void main(String[] args) {
		
		int[] a={1,2,3,2,3,57,8,554,3};
		
		System.out.println("odd");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}

		}
		System.out.println("even");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
