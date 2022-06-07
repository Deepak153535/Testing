package Program;

public class Program27 {

	//27.WAP TO COUNT ODD DIGITS IN A NUMBER.
	
	public static void main(String[] args) {
		
		int number=217328182;
		int count=0;
		while(number!=0)
		{
			int rem=number%10;
			if(rem%2==1)
			{
				count++;
			}
			number/=10;
		}
		System.out.println(count);
	}
}
