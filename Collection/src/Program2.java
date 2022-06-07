import java.util.ArrayList;
import java.util.Iterator;



public class Program2 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(6);
		
		Iterator<Integer> i=a.iterator();
	
		while(i.hasNext())
		{
			Integer c=i.next();
			if(c%2==0)
			{
				System.out.println(c);
			}
			
		}
		
	}
}
