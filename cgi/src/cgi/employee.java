package cgi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class employee {

	public static void main(String[] args) {
		List<emp> empl = Arrays.asList(new emp("raj", 12000),
				new emp ("ram", 15000));

		emp.stream().collect(Collectors.groupingBy(e->e.getSalary()));
	}
}
	
	class emp{
		private String name;
		private int salary;
		
		public emp() {
		}
		public static Object stream() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String toString() {
			return "emp [name=" + name + ", salary=" + salary + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public emp(String name, int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
		
		
	}


