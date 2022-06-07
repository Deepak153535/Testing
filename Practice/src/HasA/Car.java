package HasA;

public class Car {

	String name;
	String color;
	Engine e=new Engine();
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	Car(String name,String color,Engine e)
	{
		this.name=name;
		this.color=color;
		this.e=e;
	}
	public  void display()
	{
		System.out.println(name+" "+color);
		System.out.println(e.name+" "+e.type+" "+e.color);
	}
}
