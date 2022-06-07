package MethodChenning;

public class Weapon {

	String name;
	String type;
	int weapon;
	
	public static Weapon obj()
	{
		return new Weapon();
	}
	
	public Weapon setValue(String name, String type,int weapon)
	{
		this.name=name;
		this.type=type;
		this.weapon=weapon;
		return this;
	}
	public void display()
	{
		System.out.println("name is "+name);
		System.out.println("Gun type is "+type);
		System.out.println("Weapon is "+weapon);
	}
	
}
