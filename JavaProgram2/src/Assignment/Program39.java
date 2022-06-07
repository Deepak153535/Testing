package Assignment;

public class Program39 {

	//39.WAP TO PRINT THE NO B/W 1 TO 20 WHICH IS DIVISIBLE BY 2 AND 4.
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=20)
		{
			if(i%2==0 || i%4==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
