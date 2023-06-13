package activity;
//static variable
class Student{
	static int fees;
	static String name = "Nila";
}
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student.fees=9999;
		System.out.println(Student.name+Student.fees);
	}

}
