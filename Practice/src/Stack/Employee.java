package Stack;

	

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	class Employee implements Comparable {
		private String name;
		private int id;

		public Employee(String string, int i) {
			this.name = string;
			this.id = i;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public int compareTo(Object o) {
			Employee e = (Employee) o;
			String name = e.name;
			return this.name.compareTo(name);
		}
	}

	