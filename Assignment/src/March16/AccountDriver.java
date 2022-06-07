package March16;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a=new Account("Deepak",4000,23532662);
		
		a.deposit(0);
		a.withdral(4001);
		a.display();
		a.amount();
	}
}
