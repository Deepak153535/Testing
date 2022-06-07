package Assignment;

public class Program116 {

	//116.wap to calculate consecutive sum (first two and next two element sum) of the array element.->IN CLASS
	
	public static void main(String[] args) {
		
		int []a= {1,2,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int b=a[i]+a[j];
				System.out.print(b+" ");
				break;
			}
			
		}
	}
}
