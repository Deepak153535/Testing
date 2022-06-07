package Assignment;

public class Program_55 {

	public static void main(String[] args) {
		
		int n=235;
		
		  while (n != 0)
		  {
	            int d = n % 10;
	            n /= 10;
	            int f = 1;
	            for (int i = 1; i <= d; i++) 
	            {
	                f *= i;
	            }
	            System.out.println(f);
		  }
	}
}
