package Object;

public class Car {

	String name;
	int price;
	String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,int price,String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Name is : "+name+"\n Price is : "+price+"\n Color is : "+color;
	}
	public int hashCode()
	{
		return price;
	}
	public boolean equals(Object o)
	{
		Car c=(Car)o;
		return this.name.equals(c.name) && this.price==(c.price) && this.color.equals(c.color);

	}
	public void finalize()
	{
		System.out.println("Clear database..... ");
	}
}
