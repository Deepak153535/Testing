package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CarDriver {

	public static void main(String[] args) {
		
		ArrayList<Car> a=new ArrayList<Car>();
		
		a.add(new Car(1234,"maruti","red"));
		a.add(new Car(2,"honda","black"));
		a.add(new Car(3,"mahindara","white"));
		
		//Collections.sort(a,new CarName());
		Collections.sort(a,new CarPrice());
		
		for(Car c:a)
		{
			System.out.println(c.price+" "+c.name+" "+c.color);
		}
		
	}
}
