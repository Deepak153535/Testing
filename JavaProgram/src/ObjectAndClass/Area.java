package ObjectAndClass;

public class Area {

	int length;
	int width;
	
	public Area() {
		// TODO Auto-generated constructor stub
	}
	Area(int l,int w)
	{
		length=l;
		width=w;
	}
	public void area()
	{
		System.out.println("Area is : "+length*width);
	}
}
