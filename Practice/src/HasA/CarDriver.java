package HasA;

public class CarDriver {

	public static void main(String[] args) {
		
		Engine e2=new Engine();
		Car c=new Car("Bmw","Red",e2);
		Engine e1=new Engine("hello",3,"re");
		Car c1=new Car("Bmw","Red",e1);
		c.display();
		c1.display();
	}
}
