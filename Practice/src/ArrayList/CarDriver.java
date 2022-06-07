package ArrayList;

import java.util.ArrayList;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car("Maruti",2345,"Red");
		Car c1= new Car("Bmw",1313,"White");
		
		System.out.println(c.name);
		ArrayList<Car> a=new ArrayList();
		a.add(c);
		a.add(c1);
		
		
		for(Car d:a)
		{
			System.out.println(d.name+" "+d.price+" "+d.color);
		}
	}
}
