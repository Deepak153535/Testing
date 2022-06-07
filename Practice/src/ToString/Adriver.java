package ToString;

public class Adriver {

	public static void main(String[] args) {
		
		A a=new A("dk",12,"red",3);
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hasCode());
		
		A a1=new A("dk",12,"red",3);
		
		System.out.println(a.equals(a1));
		a=null;
		System.gc();
	}
}
