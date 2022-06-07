package MethidChenning;

public class Program1 {

	String name;
	int price;
	
	public Program1() {
		// TODO Auto-generated constructor stub
	}
	public Program1 set(String name,int price)
	{
		this.name=name;
		this.price=price;
		return this;
	}
	public static Program1 obj()
	{
		return new Program1;
	}
	public void display()
	{
		System.out.println(name+" "+price);
	}
	
	
}
