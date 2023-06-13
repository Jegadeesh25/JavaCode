package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Student{
	int studentId;
	String studentName;
	
	
	
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public String toString() {
		return this.studentName+" "+this.studentId;
	}
	
	
	
}

public class Program1 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"A");
		Student s2 = new Student(2,"B");
		Student s3 = new Student(3,"C");
		
		Map<Integer,Student>map=new HashMap<>();
		map.put(s1.getStudentId(), s1);
		map.put(s2.getStudentId(), s2);
		map.put(s3.getStudentId(), s3);
		
		//System.out.println(map);
		//based on key
		System.out.println(map.get(s2.getStudentId()));
	
		//System.out.println(map);
	}

}
