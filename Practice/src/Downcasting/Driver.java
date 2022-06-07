package Downcasting;

public class Driver {

	public static void main(String[] args) {
		
		A a=new B();
		B b=(B)a;
		b.set();
		b.demo();
		a.set();
		
	}
}
