package AbstractClass;

public class BankDriver {

	public static void main(String[] args) {
		
		Bank b=new Sbi();
		System.out.println(b.getInt());
		Bank b1=new Pnb();
		System.out.println(b1.getInt());
	}
}
