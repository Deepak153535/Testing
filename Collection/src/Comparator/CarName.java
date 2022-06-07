package Comparator;

import java.util.Comparator;

public class CarName implements Comparator<Car>{

	public int compare(Car c1,Car c2)
	{
		return c1.name.compareTo(c2.name);
	}
	
}
