package day2;

/*

 * Demo of Nested IF

 * Accept the age and weight of a person from console input

 * check if the person age>=18 && weight >=50 then eligible to donate blood otherwise no

 */



import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;

		int weight;

		int count=0;

		Scanner s = new Scanner(System.in);

		

		while(count==0)

		{

		System.out.println("Enter the age of a person");

		age=s.nextInt();

		

		if(age>=18)

		{

			System.out.println("Enter your weight");

			weight=s.nextInt();

			if(weight>=50) //Nested if-- if block within another if block is called as nested if

			{


				System.out.println("By age and weight you are eligible to donate blood");

			}

			else

			{

				System.out.println("You are under weight to donate blood");

			}

				

		}

		else

		{

			System.out.println("You are under aged to donate blood");

		}


		System.out.println("If you want to continue press 0 or press 1");

		count=s.nextInt();

		}
	}
}
