package March28;

public class P13 {

	public static void main(String[] args) {
		
	
		System.out.println(fun(new[]{22,11,12,16,22,18}));
	}
static int[] fun(int[] data)
	{
		int m=0;
		for (int i = 1; i <data.length; i++) 
		{ 
			if (data[i]>data[i-1])
			{
				m=m+1;
			}
			
		}
		return m;
	}
}
