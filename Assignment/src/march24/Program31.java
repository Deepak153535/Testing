package march24;

public class Program31 {

	public static void main(String[] args) {
		
		int base=8;
		int pow=2;
		int i=1,power=1;
		while(i<=pow)
		{
			power=power*base;
			i++;
		}
		System.out.println("Power is : "+power);
	}
}
