package ToString;

public class A {

	String name;
	int price;
	String color;
	int id;
	public A() {
		// TODO Auto-generated constructor stub
	}
	A(String name,int price,String color,int id)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.id=id;
	}
	public  String toString()
	{
		return "name is: \n"+name+"\n price is \n"+price+"\n "+"Color is \n"+color+"\n id \n"+id;
	}
	public int hasCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		A a=(A)o;
		return this.name.equals(a.name) && this.price==(a.price) && this.color.equals(a.color) && this.id==(a.id);
	}
	protected void finalize()
	{
		System.out.println("Disconnect...");
		System.out.println("okk");
	}
}
