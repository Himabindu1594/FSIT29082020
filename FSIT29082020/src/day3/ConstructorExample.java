package day3;

class Student{

	private int studentId;

 private	String studentName;

	

		Student() //Default constructors

		{

		studentId=10;

		studentName="xxx";

		}

	

		Student(int studentId, String studentName) //Parameterized constructors

		{

			this.studentId=studentId;  //this refers to current class instance and helps to assign values to instance level variables

			this.studentName=studentName;

		}
		void display()

        {

        	System.out.println("Student Id is = " + studentId);

        	System.out.println("Student name is = " + studentName);

        }



}


public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();

		Student s2=new Student(101,"Swarna");

	    s1.display();

	    s2.display();

	}

}
