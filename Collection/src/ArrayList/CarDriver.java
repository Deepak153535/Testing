package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarDriver {

	public static void main(String[] args) {
		
		
		Car c1=new Car("Deepak",22);
		Car c2=new Car("Vikas",11);
		Car c3=new Car("Bikky",44);
		
		ArrayList<Car> c=new ArrayList<Car>();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		Comparator<Car> b=new Comparator<Car>()
		{
			
			public int compare(Car r, Car r1) {
				
				return r.name.compareTo(r1.name);
			}
		};
		
		Comparator<Car> b1=new Comparator<Car>()
				{
			public int compare(Car o1,Car o2)
			{
				return o1.price-o2.price;
			}
				};
				
				Collections.sort(c,b1);
			
				System.out.println(c);
		Collections.sort(c,b);
		
	System.out.println(c);
			
	}
}
