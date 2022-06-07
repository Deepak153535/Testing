package Assignment;



//96.WAP TO CALCULATE AVERAGE OF ALL ARRAY ELEMENTS.
public class Program96 {

	public static void main(String[] args) {
		
		
		double[] a= {4,4,5,6,7};
	
		double count=0;
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			count++;
		}
		
		System.out.println("Avearge is : "+sum/count);
	}
}
