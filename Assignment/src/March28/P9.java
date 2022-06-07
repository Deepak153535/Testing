package March28;

public class P9 {

	public static void main(String[] args) {
		
		System.out.println(fun(7));
		}
	static int fun(int x) 
	{ 
	if (x == 1) 
		return 1; 
	else if (x == 2) 
		return 2;
	else 
		return fun(x - 1) * fun(x - 2);
	
	}
}
