package Assignment;

public class Program37 {

	//38.WAP TO PRINT THE NO B/W 1 TO 100 WHICH IS DIVISIBLE BY ONLY 9.
	
	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=100)
		{
			if(i%9==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
}
