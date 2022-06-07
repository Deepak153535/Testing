package Abstract;



public class CarDriver {
	public static void main(String[] args) {
		Honda h1=new Honda();
		h1.run();
		h1.accelerate();
		h1.speed();
		h1.stop();
		System.out.println("============");
		Car c1=new Honda();
		c1.run();
		c1.accelerate();
		c1.stop();
		c1.speed();
	}

}
