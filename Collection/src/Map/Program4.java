package Map;

import java.util.HashMap;

public class Program4 {

	public static void main(String[] args) {
		
		HashMap<String,String> a=new HashMap<String,String>();
		
		a.put("id", "1234");
		a.put("name", "Deepak");
		a.put("Rollno", "4");
		
		System.out.println(a);
		System.out.println(a.get("id"));
		System.out.println(a.get("name"));
	}
}
