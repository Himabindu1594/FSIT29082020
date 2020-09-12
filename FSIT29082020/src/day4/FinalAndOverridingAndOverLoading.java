package day4;

final class sample{

final int val=1000;

	void display()

{

System.out.println("I am from final class Sample");	

}

	

	void display(int x)

	{

		System.out.println("I am from final class Sample " + x);	

	}

	

	void display(int x, int y) {

	System.out.println("I am from final class Sample"+(x+y));	

	}

}

abstract class sample1{

	

	abstract void display1();

	final void display3()

	{

		System.out.println("I am a final method from sample1");

	}

}
public class FinalAndOverridingAndOverLoading extends sample1{
	@Override

		void display1() {

			// TODO Auto-generated method stub

		System.out.println("I am from display1");	

		}

		

		public static void main(String[] args) {

			// TODO Auto-generated method stub



			sample s = new sample();

			s.display();

			System.out.println("The value of final variable is = " + s.val);

		s.display(1);

		s.display(2,3);

			

		sample1 s1=new FinalAndOverridingAndOverLoading();

		

		s1.display1();

		s1.display3();

	}

}
