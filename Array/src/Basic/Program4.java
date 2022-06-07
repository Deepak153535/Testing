package Basic;

public class Program4 {

	public static void main(String[] args) {
		
		test(new int[] {10,20,30,40});
	}
	public static void test(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
