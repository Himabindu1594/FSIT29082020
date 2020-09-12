package day3;

/*

 * Please count the number of instances created to a class. 

 * Class name keep it as "Emp" and count number of Employees are added to this class.

 */



class Emp{

	static int counter=0;

	

	Emp() //Whenever we create an object default constructor will be called

	{

		counter++;

	}

}



public class StaticVariableExample {
	static {

		Emp d1=new Emp();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] e=new Emp[5];

		for(int i=0;i<e.length;i++)

		 e[i]=new Emp();

		

		Emp e1=new Emp(); //6th obj

		Emp e2=new Emp(); //7th obj

		

		System.out.println("The number of instanes created for Emp is " + Emp.counter);

	}

}
