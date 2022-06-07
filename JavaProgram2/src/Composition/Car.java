package Composition;

public class Car {

	String name;
	int price;
	Engine e=new Engine("hp",40,4);
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int price)
	{
		this.name=name;
		this.price=price;
		
	}
	public void display()
	{
		System.out.println("Car name is : "+name);
		System.out.println("Car price is : "+price);
		System.out.println("Engine Brand is : "+e.brand);
		System.out.println("Engine hp is : "+e.hp);
		System.out.println("Engine cylender is : "+e.noOfCylender);
		System.out.println();
	}
}
