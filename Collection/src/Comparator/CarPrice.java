package Comparator;

import java.util.Comparator;

public class CarPrice implements Comparator<Car>{

	public int compare(Car c1,Car c2)
	{
		if(c1.price==c2.price)
		{
			return  0;
		}
		else if(c1.price>c2.price)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
}
