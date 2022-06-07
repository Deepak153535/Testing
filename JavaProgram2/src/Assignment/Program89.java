package Assignment;

public class Program89 {

	//89.WAP TO FIND THE SMALLEST VALUE IN AN ARRAY.
	
	public static void main(String[] args) {
		
		int n[]= {2,4,6,5,4,2,8,9};
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[i])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			System.out.println(n[0]);
			break;
		}
	}
	
}
