package ObjectAndClass;

public class Car {

	String name;
	int price;
	String color;
	
	public void setValue(String n,int p,String c)
	{
		name=n;
		price=p;
		color=c;
	}
	public void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Price is : "+price);
		System.out.println("Color is : "+color);
	}
}
