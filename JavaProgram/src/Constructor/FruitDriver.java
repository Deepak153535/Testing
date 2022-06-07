package Constructor;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f=new Fruit("Mango",40);
		Fruit f1=new Fruit();
		f1.name=f.name;
		f1.price=f.price;
		
		f.display();
		f1.display();
				
	}
}
