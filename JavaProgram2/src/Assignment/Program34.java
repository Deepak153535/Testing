package Assignment;

public class Program34 {

	//34.CALCULATE THE SUM OF SQUARE OF EACH DIGIT IF DIGIT IS EVEN IN A NUMBER.
	
	public static void main(String[] args) {
		
		int n=342912983;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				int pow=1;
				int i=1;
				while(i<=2)
				{
					pow=pow*rem;
					i++;
				}
				System.out.println(pow);
				sum=sum+pow;
			}
			n=n/10;
		}
		System.out.println("sum os even power is : "+sum);
	}
}
