package day1;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;

		int num2;
		
		int num3;

		Scanner s = new Scanner(System.in);



			System.out.println("Enter the first number");

			num1=s.nextInt();

			System.out.println("Enter the second number");

			num2=s.nextInt();
			
			System.out.println("Enter the third number");

			num3=s.nextInt();

			s.close();
			


			

			System.out.println("&& Comparison = " + (((num1>num2)&&(num1<num3)&&(num2<num3))));

			System.out.println("|| Comparison = " + (((num1>num2)||(num1<num3)||(num2<num3))));

			System.out.println("! Comparison = " + !(num1<=num2));
	}

}
