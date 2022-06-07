package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Program3 {

	public static void main(String[] args) {
		
		Map<Integer,String> a=new HashMap<Integer,String>();
		
		a.put(1, "rajesh");
		a.put(2, "vk");
		a.put(3, "raj");
		
		a.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		
		.forEach(System.out::println);	
		
	}
}
