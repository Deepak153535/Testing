package Encapsulation;

public class Car {

	private String name;
	private int price;
	private String color;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColor()
	{
		return color;
	}
}
