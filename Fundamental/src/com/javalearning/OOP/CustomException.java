package com.javalearning.OOP;


	class StudentNotFoundException extends Exception {
		String msg;
		StudentNotFoundException(String msg){
			this.msg = msg;
		}
		
		public void showDetails() {
			System.out.println(this.msg);
		}
		
	}

	class Student{
	
		public static void studentDetails(int Id) {
			if(Id != 102) {
				try {
					throw new StudentNotFoundException("Id not found");
				}catch(StudentNotFoundException se) {
					se.showDetails();
				}
			}else {
				System.out.println("Student details found");
			}
		}
	}

	public class CustomException {
		
	public static void main(String[] args) {
			Student.studentDetails(102);

	}

}
