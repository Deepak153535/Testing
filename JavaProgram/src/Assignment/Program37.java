package Assignment;

public class Program37 {

	//37.WAP TO PRINT THE NO B/W 1 TO 30 WHICH IS DIVISIBLE BY 3 AND 9.
	
	public static void main(String[] args) {
		
		int n=30;
		int i=1;
		while(i<=n)
		{
			if(i%3==0 || i%9==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
