package ArrayList;

public class P2 {

	String name;
	
	
	P2(String name)
	{
		this.name=name;
	
	}
	
	
     public static void main(String[] args) {
		
		P2 s2=new P2("Ravi");
		P2 s=new P2("Shohan");
		
		P2[] d={s2,s};
		
		for(P2 c:d)
		{
			System.out.println(c.name);
		}
		
	}
	
}
