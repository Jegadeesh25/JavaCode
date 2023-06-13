package Collection;

import java.util.ArrayList;
import java.util.List;

class Employee {
	int empId;
	String empName;
	
	Employee (int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	public String toString() {
		return empId+" "+empName;
	}
}
public class ListIntro {

	public static void main(String[] args) {
		Employee e1 = new Employee(2,"ja");
		List <Employee> list = new ArrayList<>();
		list.add(e1);
		System.out.println(list);
	}

}
