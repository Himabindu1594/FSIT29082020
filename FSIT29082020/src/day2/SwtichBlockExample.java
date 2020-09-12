package day2;


import java.util.Scanner;

public class SwtichBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day;
		int count;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day");
		day = s.nextInt();
		
		
		switch(day)

        {

        case 1: System.out.println("Monday");

        		break;

        		

        case 2: System.out.println("Tuesday");

				break;



        case 3: System.out.println("Wednesday");

				break;



        case 4: System.out.println("Thursday");

				break;



        case 5: System.out.println("Friday");

				break;



        case 6: System.out.println("Saturday");

				break;

        case 7: System.out.println("Sunday");

				break;

		default:

				System.out.println("Invalid Input");

		



        }

        System.out.println("If you want to continue press 0 or press 1");

		count=s.nextInt();

		}

}


