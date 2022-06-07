package AbstractClass;

public class BikeDriver extends Bike {

	public void run()
	{
		System.out.println("run safely");
	}
	public static void main(String[] args) {
		
		Bike b=new BikeDriver();
		b.run();
	}
}
