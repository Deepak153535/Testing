package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		String text="";
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Jan");
		a.add("Feb");
		a.add("Mar");
		a.add("May");
		a.add("Jun");
		a.add("July");
		a.add("Aug");
		a.add("Sep");
		a.add("Oct");
		a.add("Nov");
		a.add("Dec");
		
		Collections.sort(a);
		System.out.println(a);
		
	}
}
