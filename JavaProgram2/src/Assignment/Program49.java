package Assignment;

public class Program49 {

	//49.WAP TO CREATE A METHOD TO PERFORM ADDITION OF TWO NOS THEN INSIDE THE MAIN METHOD CHECK THE ADDITION OF TWO NOS IS EVEN OR ODD.->IN CLASS
	
	public static void main(String[] args) {
		
		int a=sum(4,6);
		if(a%2==0)
		{
			System.out.println(a+" even");
		}
		else
		{
			System.out.println(a+" odd");
		}
	}
	public static int sum(int a,int b)
	{
		int c=a+b;
		return c;
		
		
	}
}
