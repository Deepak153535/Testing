package March28;

public class P10 {

	public static void main(String[] args) {
		
		System.out.println(foo(24,15));
	}
	static int foo(int x, int y)
	{ if (x == y) 
		return x;
	else if (x > y) 
		return
	foo(x - y, y);
	else return 
	foo(x, y - x);
	}
}
