package March28;

public class P3 {

	public static void main(String[] args) {
		
		P3 p=new P3();
		
		System.out.println(p.enig({5,8,2,9,10,1,14,7,6,12,0,3},4,11));		
	}
	public  int enig(int a[],int start,int end)
	{
		if(start>end)
		{
			return -1;
		}
		else if(start==end)
		{
			return a[start];
		}
		else
		{
			return a[start]>enig(a,start+1,end)?a[start]:enig(a,start+1,end);
		}
		
	}
}
