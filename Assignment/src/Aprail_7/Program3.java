package April_7;

public class Program3 {

	public static void main(String[] args) {
		
		int[] a={20,30,40,50,50,60};
		
		int big=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		
		System.out.println("Big is : "+big);

	}
}
