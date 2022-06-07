package ToString;

public class Driver {

	
		public static void main(String[] args) {
			Car c1=new Car("Maruti", 465477, "White", 30);
			System.out.println(c1);
			System.out.println(c1.toString());
			System.out.println(c1.hashCode());
			
			Car c2=new Car("Honda", 435346, "Black", 50);
			System.out.println(c2);
			System.out.println(c2.toString());
			System.out.println(c2.hashCode());
			
			Car c3=new Car("Maruti", 465477, "White", 30);
			System.out.println(c1==c3);
			System.out.println(c1.equals(c2));
			Car c4=new Car("Maruti", 465477, "White", 33);
			
			System.out.println(c1.equals(c3));
			System.out.println(c1.equals(c4));
			c1=c4=null;
			System.out.println(c1.name);
			System.gc();
			c2=null;
			System.gc();
		}
}
