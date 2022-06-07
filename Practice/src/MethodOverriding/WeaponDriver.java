package MethodOverriding;

public class WeaponDriver {

	public static void main(String[] args) {
		
		Weapon w=new Weapon();
		w.use();
		
		Gun g=new Gun();
		g.use();
		
		Weapon w1=new Gun();
		w1.use();
		
		Weapon w2=new Bomb();
		w2.use();
	}
}
