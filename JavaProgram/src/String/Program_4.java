package String;

public class Program_4 {

	//4) Java Program to count the total number of vowels and consonants in a string
	
	public static void main(String[] args) {
		
		String s="java is best";
		
		
		String a=s.toLowerCase();
		int vcount=0,ccount=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				vcount++;
			}
			else if(a.charAt(i)>='a' && a.charAt(i)<='z')
			{
				ccount++;
			}
		}
		System.out.println(vcount+" "+ccount);
	}
}
