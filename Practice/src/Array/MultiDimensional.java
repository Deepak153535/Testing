package Array;

public class MultiDimensional {

	public static void main(String[] args) {
		
		int[][] a=new int[2][];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
	}
}
