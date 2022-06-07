package Constructor;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1=new Car("Honda",1323);
		Car c2=new Car(c1);
		c1.display();
		c2.display();
	}
}

