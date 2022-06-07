package Queue;

public class Emp implements Comparable<Emp> {

	int id;
	String name;
	int age;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	Emp(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	
	public String toString() {
		
		return " "+id+" "+name+" "+age;
	}
	public int compareTo(Emp o) {
		
		if(age<o.age)
		{
			return -1;
		}
		else if(age>o.age)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
	
}
