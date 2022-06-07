package LinkedList;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
public class Program1 {

	public static void main(String[] args) {
		
		
		
	
		List b=new LinkedList();
		
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		//System.out.println(b);
		
		List a=new ArrayList(b);
		
		for(Object i:a)
		{
			System.out.println(i);
		}
	//	System.out.println(a);
	}
}
