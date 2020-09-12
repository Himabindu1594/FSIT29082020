package day3;


class Test{

	

	void display()

	{

		System.out.println("I am from display method");

	}

	void print()

	{

		

		System.out.println("I am from print method");
		this.display(); //this equivalent to you calling t.display() from main meethod


	}

}
public class ThisInvokesCurrentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();

		t.print();

	}

}
