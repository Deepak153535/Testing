package Assignment;

public class Program126 {

	//126.WAP TO COUNT THE CHARACTERS PRESENT IN STRINGWITHOUT USINGLENGTH().->IN CLASS
	
	public static void main(String[] args) {
		
		String s="java by deepak";
		
		char[] a=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
