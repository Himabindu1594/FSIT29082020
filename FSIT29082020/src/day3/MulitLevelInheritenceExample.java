package day3;

class Animal

{

   int noofLegs;

   public void eat()

   {

	   System.out.println("I am a Animal....I am Eating.....");

   }

}

class Dog extends Animal

{

	public void bark()

	{

		System.out.println("I am a Dog....I am Barking");

	}



}

class Puppy extends Dog

{

	public void weeps()

	{

		System.out.println("Since I am puppu...I am weeping....");

	}



}


public class MulitLevelInheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy();

		p.eat();

		p.bark();

		p.weeps();


		Dog d =new Dog();

		d.eat();

		d.bark();

		Animal a = new Animal();

		a.eat();
	}

}
