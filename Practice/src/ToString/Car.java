package ToString;

public class Car {

	String name;
	int price;
	String color;
	int vehicleId;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name, int price, String color, int vehicleId)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.vehicleId=vehicleId;
	}
	public String toString()
	{
		return "[Name is: "+name+" price is: "+price+" color is: "+color+" Vehicle Id is: "
	+vehicleId;
	}
	
	public int hashCode() {
		
		return vehicleId;
	}
	public boolean equals(Object o)
	{
		Car c=(Car) o;
		return this.name.equals(c.name) && this.price==c.price && this.color.equals(c.color) 
				&& this.vehicleId==c.vehicleId;
	}
	protected void finalize()
	{
		System.out.println("disconnect the Network connectivity");
		System.out.println("detach databse......");
		System.out.println("disconnect all other connectivity........");
	}
}
