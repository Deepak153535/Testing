package March28;

public class P11 {

	public static void main(String[] args) {
		
		System.out.println(foo(6));
	}
	static int foo(int x) 
	{ 
	if (x == 0) 
	
		return 0; 
	else 
		
		return x +foo(x-1);
	}
}
