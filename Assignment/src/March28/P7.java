package March28;

public class P7 {

	public static void main(String[] args) {
		
	ev(2,4);
		
	}
	static int ev(int a,int b)
	{
		if(a>0||b>0)
		{
			return 1;
		}
		else if(b>=0)
		{
			return 2;
		}
		else if(a>0)
		{
			return 3;
		}
		return 4;
	}
}
