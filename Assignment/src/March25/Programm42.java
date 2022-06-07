package March25;

public class Programm42 {

	public static void main(String[] args) {
		
		int n=28;
		int r=n;
		int sum=0,i=1;
		
		while(n>i)
		{
			if(n%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			i++;
		}
		if(sum==r)
		{
			System.out.println("Perfact Number is : "+sum);
		}
		else
		{
			System.out.println("Not Perfact Number : "+sum);
		}
	}
}
