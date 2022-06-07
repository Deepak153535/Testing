package SuperCall;

public class Program2 extends Program1{

	String color;
	int id;
	
	public Program2() {
		// TODO Auto-generated constructor stub
	}
	Program2(String name,int price,String color,int id)
	{
		super(name,price);
		this.color=color;
		this.id=id;
	}
	public void display()
	{
		System.out.println(name+" "+price+" "+color+" "+id);
	}
}
