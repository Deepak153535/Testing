package String;

public class Program {

	public static void main(String[] args) {
		
		String s="java";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(s.contains("ja"));
		System.out.println(s.contains("va"));
	}
}
