package Assignment;

public class Program71 {

	//77.CREATE ARRAY TO STORE TEN DECIMAL VALUES AND DISPLAY IT.
	
	public static void main(String[] args) {
		
		float[] a= new float[9];
		a[0]=10.3f;
		a[1]=2.1f;
		a[2]=4.3f;
		a[3]=5.3f;
		a[4]=7.3f;
		a[5]=10.5f;
		a[6]=9.2f;
		a[7]=8.3f;
		a[8]=7.33f;
		//a[9]=44.3f;
		//a[10]=33.22f;
		//a[11]=11.3f;
		
		for(float i:a)
		{
			System.out.println(i);
		}
		
	}
}
