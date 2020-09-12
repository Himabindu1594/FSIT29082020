package day3;

class Cat extends Animal

{

	void drinks()

	{

		super.eat();

		System.out.println("I am cat...I like Milk");

	}

}

class Kitten extends Cat

{

	void afraid()

	{

		super.drinks();

		System.out.println("I am a Kitten....I am afraid of Dogs");

	}

}


public class HybridInheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kitten k = new Kitten();

		k.afraid();
		Puppy p =new Puppy();

		p.eat();

		p.bark();

		p.weeps();

		

	}

}
