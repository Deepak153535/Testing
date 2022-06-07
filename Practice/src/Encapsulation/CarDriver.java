package Encapsulation;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.setName("Bmww");
		c.setColor("Red");
		c.setPrice(400);
		
		System.out.println("name : "+c.getName()+" color : "+c.getColor()+" price : "+c.getPrice());
	}
}
