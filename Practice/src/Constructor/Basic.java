package Constructor;

public class Basic {

	String name;
	int rollno;
	int price;
	String color;
	
	public Basic() {
		// TODO Auto-generated constructor stub
	}
	Basic(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	Basic(String name,int rollno,int price)
	{
		this(name,rollno);
		this.price=price;
	}
	Basic(String name,int rollno,int price,String color)
	{
		this(name,rollno,price);
		this.color=color;
	}
	public void display()
	{
		System.out.println(name+" "+rollno);
	}
}
