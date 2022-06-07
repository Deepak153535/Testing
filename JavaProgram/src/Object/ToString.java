package Object;

public class ToString {

	String name;
	int price;
	
	public ToString() {
		// TODO Auto-generated constructor stub
	}
	ToString(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return "Name is : "+name+" \n"+"Price is  : "+price;
	}
	public void display()
	{
		System.out.println("name is : "+name);
		System.out.println("price is : "+price);
	}
	public boolean equals(Object o)
	{
		ToString s=(ToString) o;
		return this.name.equals(s.name) && this.price==(s.price);
	}
	protected void finalize()
	{
		System.out.println("Clear database");
	}
}
