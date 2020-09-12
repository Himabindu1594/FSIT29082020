package day1;

import java.util.Scanner;

/*

 * Demo of If and else block

 * Accept the 4-digit number as year value from the console input

 * check whether the entered year is a leap year or not

 * feb-29 days then it is leap year-- 2020 is a leap year

 * (year%400 == 0) || ((year%4==0) && (year%100 !=0))

 */

public class IfBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 4-digit year value");

		year=scan.nextInt();





				if((year%400 == 0) || ((year%4==0) && (year%100 !=0))) //This block works when the condition is true

				{

					System.out.println("Entered year is a leap year");

				}

				else

				{

					System.out.println("Entered year is not a leap year");

				}



	}

}
