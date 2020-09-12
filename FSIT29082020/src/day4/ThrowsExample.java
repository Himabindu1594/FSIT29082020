package day4;

import java.io.IOException;



class NF{

	

	void ageCheck(int age) throws Exception

	{

		if(age>=18)

			System.out.println("You are eligible to vote");

		else

			throw new NumberFormatException("Not a valid age to vote");

	}

	void n() throws IOException

	{

		throw new IOException("device error");

	}

	

}

public class ThrowsExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		NF f = new NF();

	

		try

		{

		f.ageCheck(19);

		f.n();

		}catch(Exception e) {System.out.println(e);}

		finally {

			System.out.println("I run whether error occur or not");

		}

	System.out.println("Rest of the code......");

	}

}
