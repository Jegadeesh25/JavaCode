package activity;
//cloneArray
//deep copy
public class Activity6 {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,7,8,9};
		
		int clonenum[]=num.clone();
		
		for (int i=0;i<clonenum.length;i++) {
			System.out.println(clonenum[i]+" "+num[i]);
		}

	}

}
