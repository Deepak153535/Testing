package String;

public class CountVowel {

	public static void main(String[] args) {
		
		String data="This is really simple sentence";
		
		data=data.toLowerCase();
		int vcount=0,ccount=0;
		
		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)=='a'||data.charAt(i)=='e'||data.charAt(i)=='i'||data.charAt(i)=='o'||data.charAt(i)=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		
		System.out.println("Vowel is : "+vcount);
		System.out.println("Consonant is : "+ccount);
	}
}
