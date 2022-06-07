package March25;

public class Program37 {

	public static void main(String[] args) {
		
		int i=1;
		while(i<=30)
		{
			//System.out.println(i);
			if(i%3==0 || i%9==0)
			{
				System.out.println(" Divisible  by 3 or 9 : "+i);
			}
			i++;
		}
	}
}
