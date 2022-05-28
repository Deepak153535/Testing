
public class AddressDriver {

	public static void main(String[] args) {

		Address a = new Address("rtb", "bsb", "up");

		Emp e = new Emp(1, "varun", a);
		e.display();
	}
}
