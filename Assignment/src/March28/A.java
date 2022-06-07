package March28;

public class A {
	
	{public void dolt() 
	System.out.print("1 am A");
	}} 
	
class B extends A 
{ public void dolt() 
{System.out.print("I am B");
}} 
class C extends B 
{public void dolt()
{ System.out.print("1 am C"); 
}} 
public static void main(String[] args)
{
	A x=new B()
			 x.dolt();
	}
}


