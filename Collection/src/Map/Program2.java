package Map;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		
		Map<Integer,String> a=new HashMap<Integer,String>();
		
		a.put(1, "java");
		a.put(2, "python");
		a.put(3, "C#");
		a.put(4, "Dort");
		
		for(Map.Entry i:a.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
