package Constructor;

public class CopyDriver {

	public static void main(String[] args) {
		
		CopyConstructor p=new CopyConstructor("Maruti",373);

		CopyConstructor p1=new CopyConstructor(p);
//		p.display();
//		p1.display();
//		
		CopyConstructor c=new CopyConstructor("bmw",226);
		CopyConstructor c1=new CopyConstructor();
		c1.name=c.name;
		c1.id=c.id;
		c.display();
		c1.display();
		
	}
}
