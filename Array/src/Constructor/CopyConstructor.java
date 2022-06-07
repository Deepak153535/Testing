package Constructor;

public class CopyConstructor {

	String name;
	int id;
	
	public CopyConstructor() {
		// TODO Auto-generated constructor stub
	}
	CopyConstructor(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
	}
	CopyConstructor(CopyConstructor c)
	{
		name=c.name;
		id=c.id;
	}
}
