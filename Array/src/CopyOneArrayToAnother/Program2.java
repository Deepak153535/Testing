package CopyOneArrayToAnother;

public class Program2 {

	public static void main(String[] args) {
		
		int[] a= {2,3,4,5,2,3,7,8,1,9,5};
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.print(a[i]);
					
					String ss=Integer.toString(a[i]);
					s=s.concat(ss);
				}

			}
		}
		System.out.print(s);
	}
}
