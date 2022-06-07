package March30;

public class Program56 {

	public  static int findfact(int num){
		int fact=1;
		while(num>0){
			fact=fact*num;
			num--;
		} 
		System.out.println(fact);
		return fact;
	}
	public static void main(String[] args) {
		
		int num=1234;
		while(num>0){
			int rem=num%10;
			{
				findfact(rem);
			}
			num=num/10;
		}
		
	}
	
}