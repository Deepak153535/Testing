package MethodChenning;

public class WeaponDriver {

	public static void main(String[] args) {
		
		Weapon w=new Weapon();
		w.setValue("Gun", "Automatic", 40).display();
		System.out.println(Weapon.obj());
		
		System.out.println("=======================");
		
		Weapon w1=new Weapon();
		Weapon.obj().setValue("Run", "Manual", 30).display();;
		
		Weapon w3=new Weapon().obj();
		w3.setValue("null", "null", 0).display();
	}
}
