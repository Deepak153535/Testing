package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1=new Car("Maruti", 12345);
		Car c2=new Car("honda",2);
		Car c3=new Car("bmw",34);
		
		ArrayList<Car> a=new ArrayList<Car>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		System.out.println(a);
		Comparator<Car> carage=new Comparator<Car>()
		{
	
			public int compare(Car o1,Car o2)
			{
				return o1.price-o2.price;
						
			}
			
		};
		Comparator<Car> carname=new Comparator<Car>()
		{
	
			public int compare(Car o1,Car o2)
			{
				return o1.name.compareTo(o2.name);
						
			}
			
		};
		//Collections.sort(a,carage);
		Collections.sort(a,carname);
		System.out.println(a);
	}
}
