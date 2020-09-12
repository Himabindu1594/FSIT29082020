package day1;
import java.util.Scanner;
public class DataTypeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bo=false;
		char c='c';
		byte b=100;
		short s=32767;
		int i=32768;
		float f=23.45f;
		double d=54.34;
		String st ="bindu";
		
		//Reading the values from console input..

		

				Scanner scn = new Scanner(System.in);

				

				

				c = 'A';

				System.out.println("Enter the boolean value");

				bo=scn.nextBoolean();

				System.out.println("Enter the byte value");

				b=scn.nextByte();

				

				System.out.println("Enter the short value");

				s=scn.nextShort();

				

				System.out.println("Enter the int value");

				i=scn.nextInt();

				

				System.out.println("Enter the Float value");

				f=scn.nextFloat();

				

				System.out.println("Enter the Double value");

				d=scn.nextDouble();

				

				System.out.println("Enter the String value");
				st=scn.next();
		
		System.out.println("BOOLEAN value is ="+bo);
		System.out.println("char value is ="+c);
		System.out.println("byte value is ="+b);
		System.out.println("short value is ="+s);
		System.out.println("int value is ="+i);
		System.out.println("float value is ="+f);
		System.out.println("double value is ="+d);
		System.out.println("string value is ="+st);


	}

}
