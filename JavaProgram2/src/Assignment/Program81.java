package Assignment;

public class Program81 {

	//81.WAP  TO CALCULATE SUM OF ARRAY ELEMENTS.->IN CLASS
	
	public static void main(String[] args) {
		
		int[] a= {2,4,5,6,8,9,0,1};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		
	}
}
