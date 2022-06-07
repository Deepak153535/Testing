import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(12);
		a.add(15);
		a.add(17);
		a.add(18);
		a.add(2);
		a.add(4);
		a.add(7);
		
		Iterator<Integer> i=a.iterator();
		
		while(i.hasNext())
		{
			//Object o=new Iterator();
			Integer j=i.next();
			
			if(j%2==0)
			{
				System.out.println(j);
			}
		}
	}
}
