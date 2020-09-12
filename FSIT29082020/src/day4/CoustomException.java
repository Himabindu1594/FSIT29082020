package day4;

class InvalidAge extends Exception

{

		InvalidAge(String a)

		{

			super(a);	

		}



}



public class CoustomException {
	static void ageCheck(int age) throws InvalidAge

	{

		if(age>18)

			System.out.println("You are eligible to vote");

		else

			throw new InvalidAge("Not a valid age to vote");

	}

	



	public static void main(String[] args) {

		// TODO Auto-generated method stub



	try

	{

		ageCheck(13);

	}

	catch(InvalidAge e)

	{

		System.out.println(e);

	}

	finally

	{

		System.out.println("I am the final block");

	}

	System.out.println("Rest of the line...");
	}

}
