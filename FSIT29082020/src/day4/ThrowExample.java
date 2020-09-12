package day4;

public class ThrowExample {
	static void ageCheck(int age)

	{

		if(age>18)

			System.out.println("You are eligible to vote");

		else

			throw new NumberFormatException("Not a valid age to vote");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try

		{

			ageCheck(13);

		}

		catch(NumberFormatException e)

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


