package Java;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car("Maruti",123,"Red");
		Car c1=new Car("bmw",21,"Blue");
		
		c.display();
		c1.display();
		
		c=null;
		System.out.println(c);
		System.gc();
		System.out.println("hello");
	}
}
