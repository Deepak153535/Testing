package Test;

public class Method {

	public static void main(String[] args) {
		
		String name="   abc  a";
		
		if(name.isEmpty()==false)
		{
			System.out.println("hello");
		}
		System.out.println(name.trim().length());
		
		if(name.trim().length()==0)
		{
			System.out.println("empty");
		}
		
	}
}
