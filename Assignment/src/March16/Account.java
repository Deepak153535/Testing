package March16;

public class Account {

	
		
		int amount;
		int accountNo;
		String name;
		
		Account()
		{}
		Account(String name,int amount,int accountNo)
		{
			this.name=name;
			this.amount=amount;
			this.accountNo=accountNo;
		}
		public void deposit(int amt)
		{
			amount=amount+amt;
			System.out.println("Deposite Balance :"+amt);
		}
		public  void withdral(int amt)
		{
			if(amount<amt)
			{
				System.out.println("Insufficient Balance");
			}
			else
			{
				amount=amount-amt;
				System.out.println("Withdarl Balance : "+amt);
				
			}
		}
		public void amount()
		{
			System.out.println("Amount is :"+amount);
		}
		public void display()
		{
			System.out.println(name+" "+amount+ "  "+accountNo);
			
		}
}
