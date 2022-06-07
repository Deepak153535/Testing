package Static;

public class CarDriver {

	public static void main(String[] args) {
		
		Car.change();
		
		Car c1=new Car("Honda",213);
		Car c2=new Car("I20",21);
		c1.display();
		c2.display();
	}
}
