package HashMap;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		
		a.put(1, "java");
		a.put(2, "python");
		a.put(3, "C#");
		a.put(1,"selenium");
		
		for(HashMap.Entry i:a.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		a.putIfAbsent(2, "C");
	}
}

