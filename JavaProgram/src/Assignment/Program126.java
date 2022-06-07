package Assignment;

public class Program126 {

	//126.WAP TO COUNT THE CHARACTERS PRESENT IN STRINGWITHOUT USINGLENGTH().->IN CLASS
	
	public static void main(String[] args) {
		
		String s="Java ";
		
		int count=0;
		
		char[] a=s.toCharArray();
		
		for(char i:a)
		{
			count++;
		}
		System.out.println(count);
		
	}
}
