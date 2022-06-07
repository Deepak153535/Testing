
public class CovertLower {

	public static void main(String[] args) {
		
		String name="AJJDSHH";
		
		char [] c=name.toCharArray();
		
		int saj='d';
		
		System.out.println(saj);
		for(int i=0;i<c.length;i++)
		{
			char a=c[i];
			int b=a+32;
			char d=(char)b;
			
			System.out.print(d);
			
		}
	}
}
