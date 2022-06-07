package ArrayProgram;

public class Program19 {

	public static void main(String[] args) {
		
		int[] a={1,2,5,3,4,7,9};
		
		int small=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println(small+1);
	}
}
