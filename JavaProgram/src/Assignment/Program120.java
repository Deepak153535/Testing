package Assignment;

public class Program120 {

	//121.wap to show the count of numbers present in the array.->IN CLASS
	
	public static void main(String[] args) {
		
		int[]a= {1,2,3,6,7,8,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
			System.out.println(a[i]);
		}
		System.out.println("Presant Number Count is : "+count);
	}
}
