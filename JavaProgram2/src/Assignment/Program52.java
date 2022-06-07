package Assignment;

public class Program52 {

	//52.DESIGN A METHOD TO RETURN POWER OF A NO.
	
	public static void main(String[] args) {
		
		int power=pow(5);
		System.out.println("Power is : "+power);
		
	}
	public static int pow(int n)
	{
		n=n*n;
		return n;
	}
}
