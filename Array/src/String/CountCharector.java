package String;

public class CountCharector {

	public static void main(String[] args) {
		
		String data="java is best";
		
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
