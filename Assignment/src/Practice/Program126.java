package Practice;

//126.WAP TO COUNT THE CHARACTERS PRESENT IN STRINGWITHOUT USINGLENGTH().->IN CLASS

public class Program126 {

	public static void main(String[] args) {
		
		String s="java is best";
		
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				count++;
			}
		}
		System.out.println("Count String Charecter is : "+count);
		
		
	}
}
