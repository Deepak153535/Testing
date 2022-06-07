package Object;

public class Driver {

	public static void main(String[] args) {
		
		ToString s=new ToString("Raj",433);
		
		ToString s1=new ToString("Raj",433);
		
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		System.out.println(s);
		
		System.out.println(s.equals(s1));
	
		System.gc();
		s=null;
		System.gc();
		
		
	}
	
}
