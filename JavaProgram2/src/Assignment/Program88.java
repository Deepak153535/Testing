package Assignment;

public class Program88 {

	//88.WAP TO FIND LARGEST ELEMENT IN AN ARRAY.->IN CLASS
	
	public static void main(String[] args) {
		
		int n[]= {2,3,4,6,7,8,9,10,34,2,1};
		
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]<n[j])
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
