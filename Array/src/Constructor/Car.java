package Constructor;

public class Car {

	String name;
	int id;
	String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int id,String color)
	{
		this.name=name;
		this.id=id;
		this.color=color;
	}
	
	public void insert(String name,int id,String color)
	{
		this.name=name;
		this.id=id;
		this.color=color;
	}
	public void display()
	{
		System.out.println("Car name is : "+name);
		System.out.println("Car id is : "+id);
		System.out.println("Car color is : "+color);
		System.out.println("========================");
	}
	
}
