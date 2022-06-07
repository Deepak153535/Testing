package March25;

public class Program40 {

	public static void main(String[] args) {
		
		int i=20;
		int sum=0;
		while(i<=60)
		{
			if(i%11==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		System.out.println("Sum is : "+sum);
	}
}
