package Assignment;

public class Program40 {

	//40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO SHOULD BE DIVISIBLE BY ONLY 11.
	
	public static void main(String[] args) {
		
		int i=20;
		
		while(i<=60)
		{
			if(i%11==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
}
