package BasicProgram;

public class Factorial {

	//5!=5*4*3*2*1
	
	public static void main(String[] args) {
		
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println(" Factorial is : "+fact);
	}
}
