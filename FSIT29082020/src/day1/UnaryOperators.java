package day1;

/*

 * Demo of Unary Operators

 * ++, --

 * This is also called as Pre Increment/Decreemnt or Post Increment/Decrement operators

 * pre increment/decrement the value will be incremented/decremented the new value will be available on the same line

 * post increment/decrement the vaue will be incremented/decremented but the new value will be available from next line. 

 */

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		a=s.nextInt();
		
		System.out.println("Post Increment =" + a++); // a=a+1--> a=11..incremented value will be available from next line.

		System.out.println("Pre Increemnt =" + ++a); //a=a+1--> a=12..increments the value and new value will be available on the same line.		

		System.out.println("Post Decrement =" + a--); //a=a-1--> a=11..decremented value will be available for the next line.	

		System.out.println("Pre Decrement =" + --a); //a=a-1--> a=10..decremented value will be available on the same line.	

			

		System.out.println(a++ + ++a + --a); // 10+12+11=33

			
		

	}

}
