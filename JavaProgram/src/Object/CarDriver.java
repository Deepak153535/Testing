package Object;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c=new Car("Bmw",123456778,"White");
		System.out.println(c.toString());
		
		System.out.println("======================");
		Car c1=new Car("Bmw",123456778,"White");
		System.out.println(c1);
		
		System.out.println("Hashcoe is  : "+c.hashCode());
		System.out.println(c.hashCode());
		System.out.println("==================");
		
		System.out.println(c.equals(c1));
		
		System.out.println("====================");
		
		System.out.println(c1);
		
		System.gc();
		c=null;
		
		System.gc();
	}
}
