package day1;

import java.util.Scanner;

/*

 * This program demos the purpose of arthmetic operators

 * +,-,*,/,%(Modulus)

 */

public class ArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;

		int num2;

		Scanner s = new Scanner(System.in);



			System.out.println("Enter the first number");

			num1=s.nextInt();

			System.out.println("Enter the second number");

			num2=s.nextInt();

			s.close();

			

			System.out.println("Adition is = " + (num1+num2));

			System.out.println("Subtraction is = " + (num1-num2));

			System.out.println("Product is = " + (num1*num2));

			System.out.println("Quotient is = " + (num1/num2));

			System.out.println("Remainder is = " + (num1%num2));

			

			System.out.println(10*10/5+3-1*4/2*3);

			

	}

}
