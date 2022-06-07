package AbstractClass;

public class Circle extends Shape{

	public void set()
	{
		System.out.println("setting");
	}
	
	public static void main(String[] args) {
		
		Shape s=new Circle();
		s.set();
		Shape s1=new Ractangle();
		s1.set();
	}
	
}
