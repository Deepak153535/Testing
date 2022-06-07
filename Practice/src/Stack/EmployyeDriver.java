package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployyeDriver {

	
	
		public static void main(String[] args) {

			List<Employee> emplist = new ArrayList<Employee>();
			emplist.add(new Employee("John", 101));
			emplist.add(new Employee("Eric", 106));
			emplist.add(new Employee("Arya", 103));
			emplist.add(new Employee("Sansa", 105));
			emplist.add(new Employee("Cersei", 102));

			Collections.sort(emplist);
			
			for(Employee i:emplist)
			{
				System.out.println(i.getName()+" "+i.getId()+ " ");
			}
}

}
