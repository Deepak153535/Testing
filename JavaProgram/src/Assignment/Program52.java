package Assignment;

public class Program52 {

	//52.DESIGN A METHOD TO RETURN POWER OF A NO.
	
	public static void main(String[] args) {
		
		int a=pow(6,2);
		System.out.println(a);
	}
	public static int pow(int n,int b)
	{
		int pow=1;
		while(b>0)
		{
			pow=pow*n;
			b--;
		}
		return pow;
	}
}
