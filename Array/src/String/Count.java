package String;

public class Count {

	public static void main(String[] args) {
		
		String name="jdnkk   ";
		
		char[] c= name.toCharArray();
		int count=0;
		for(char a:c)
		{
			count++;
		}
		System.out.println(count);
		
	}
}
