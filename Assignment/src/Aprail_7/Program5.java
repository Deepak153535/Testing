package Aprail_7;

public class Program5 {

	public static void main(String[] args) {
		
		int[] a={20,30,40,35,25};
		
		int temp[]=new int[a.length+1];
		
		for(int i=0;i<temp.length;i++)
		{
			if(i<2)
			{
				temp[i]=a[i];
			}
			else if(i==2)
			{
				temp[i]=70;
			}
			else
			{
				temp[i]=a[i-1];
			}
		
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
	}
}
