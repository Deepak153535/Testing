package Static;

public class E {

	int data=10;
	E()
	{
		F f=new F(this);
		f.display();
	}
	public static void main(String[] args) {
		
		E e=new E();
	}
	
}
