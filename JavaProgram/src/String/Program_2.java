package String;

public class Program_2 {

	// 3) Java Program to count the total number of punctuation characters exists in a String
	// punctuation marks (!, . , ' , - , " , ? , ; )
	
	public static void main(String[] args) {
		
		int count=0;
		String a="He said, 'The mailman loves you.' I heard it with my own ears.";
		
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==',' || a.charAt(i)=='.' ||a.charAt(i)=='!'|| a.charAt(i)=='-'||a.charAt(i)=='?'||a.charAt(i)==':'
					||a.charAt(i)==';')
			{
				count++;
			
			}
		 }
		
			System.out.println(count);
		}

		
	
}
