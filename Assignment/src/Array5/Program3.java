package Array5;

public class Program3 {

	public static void main(String[] args) {
		
		int[] a=new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("=======================");
		
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
