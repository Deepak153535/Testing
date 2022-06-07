package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		
		m.put(1, "java");
		m.put(2, "C#");
		m.put(3, "Vk");
		
		System.out.println(m);
		
		Set s=m.entrySet();
		
		System.out.println(s);
		
		
	}
}
