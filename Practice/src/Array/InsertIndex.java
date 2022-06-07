package Array;

public class InsertIndex {

	public static void main(String[] args) {
		
		
		
		int a[]={1,2,3,4,5,6,7,9};
		int c[]=new int[a.length];
		
		int index=6;
		int value=8;
		
		a[index]=value;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
