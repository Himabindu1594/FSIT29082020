package day1;

public class VariableExample {
	int empId=100;
	static String empOrg="JIgsaw";
	
	float displaySal()
	{
		float sal=10000f;
		return sal;
	}public static void main(String[] args) {


		// TODO Auto-generated method stub





		VariableExample v = new VariableExample();


		VariableExample v1=new VariableExample();


		v.empId=1000;


		v1.empId=2000;





	System.out.println("Instance variable value is emp ID of V is " + v.empId);


	System.out.println("Static variable value is emp Org "+ empOrg );


	System.out.println("Local variable value is sal " + v.displaySal());





	System.out.println("Instance variable value is emp ID of v1 is " + v1.empId);


	}

}
