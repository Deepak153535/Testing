package Basic;

public class Program5 {

	public static void main(String[] args) {
		
		int a[]=get();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	static int[] get()
	{
		return new int[] {2,3,4,5,6};
	}
}
