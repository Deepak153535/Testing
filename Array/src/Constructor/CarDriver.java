package Constructor;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.name="Maruti";
		c.id=1221;
		c.color="Red";
		
		c.insert("Maruti",312637,"Black");
		c.display();
	//	System.out.println("===================");
		System.out.println(c.name+" "+c.id+" "+c.color);
		
		Car c1=new Car("bmw",3232,"white");
		c1.display();
		System.out.println(c1);
	}
}
