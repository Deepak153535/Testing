package Abstract;



public abstract class Car {
	
	public  abstract void run();
	public abstract void accelerate();
	
	public void speed()
	{
		System.out.println("Speed up the Car");
	}
	
	public  void stop()
	{
		System.out.println("Car stops");
	}

}