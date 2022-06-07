package Assignment;

public class Program56 {

	//56.WAP TO DESIGN A METHOD TO RETURN FACTORIAL OF EACH DIGIT IN A NUMBER AND CALCULATE SUM.->IN CLASS
	
	  public static void main(String agrs[])
	  {
		  test(45);
		  
	  }
	  public static int test(int n)
	  {
		  int sum=0;
		  int rem=1;
		  while(n>0)
		  {
			  rem=n%10;
			  sum=sum*10+rem;
			  n/=10;
		  }
		  System.out.println(sum);
		  return rem;
	  }
}
