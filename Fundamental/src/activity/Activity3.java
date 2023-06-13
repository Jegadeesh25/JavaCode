package activity;
//instance variable
class SubjectMarks {
	int ScienceMarks;
	int MathsMarks;
	int GKMarks;
}

public class Activity3 {
	public static void main(String []args) {
		//stuedent1
		SubjectMarks sub1=new SubjectMarks();
		sub1.ScienceMarks=40;
		sub1.MathsMarks=60;
		sub1.GKMarks=88;
		
		//student2
		SubjectMarks sub2=new SubjectMarks();
		sub2.ScienceMarks=48;
		sub2.MathsMarks=66;
		sub2.GKMarks=80;
		
		System.out.println(sub1.GKMarks);
		System.out.println(sub2.GKMarks);
	}

}
