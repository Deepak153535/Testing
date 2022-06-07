package Bank;

public class Driver {

	public static void main(String[] args) {

		Bank b = new Bank();
		System.out.println("Bnak rate : " + b.rate());

		Sbi s = new Sbi();
		System.out.println("Sbi rate : " + s.rate());

		Pnb p = new Pnb();
		System.out.println("Pnb rate : " + p.rate());

		Icici i = new Icici();
		System.out.println("Icici rate : " + i.rate());
	}
}
