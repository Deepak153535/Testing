
public class Emp {

	int id;
	String name;
	Address a;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, Address a) {
		this.id = id;
		this.name = name;
		this.a = a;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(a.name + " " + a.city + " " + a.state);
	}
}
