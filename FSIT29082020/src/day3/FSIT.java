package day3;

/*
 * 
 */

public class FSIT {
	
	private int studentId;
	private String studentName;
	
	void input(int id,String name)
	{
		studentId=id;
		studentName=name;
	}
	
	void output()

	{

		System.out.println("Student ID is " + studentId);

		System.out.println("Student Name is " + studentName);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FSIT ahad= new FSIT();// instance of FSIT class

		

		ahad.input(100, "ahad");

FSIT allen= new FSIT();// instance of FSIT class

		

		allen.input(100, "allen");

		ahad.output();

		

		allen.output();
		
/*FSIT ahad= new FSIT();// instance of FSIT class

	*	

	*ahad.input(100, "ahad");

     * FSIT allen= new FSIT();// instance of FSIT class

		

		*allen.input(100, "allen");

		*ahad.output();

		

		*allen.output();
		*/

	}

}
