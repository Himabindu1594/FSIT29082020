package day3;

class Stud

{

	String studName;

	Address studAddress;

	

	Stud(String studName, Address studAddress)

	{

		this.studName=studName;

		this.studAddress=studAddress;

	}

	

	void display()

	{

		System.out.println("Student name is " + studName);

		System.out.println("Student city is " + studAddress.cityName);

		System.out.println("Student city is " + studAddress.country);

	}

}

class Address{

	

	String cityName;

	String country;

	Address(String cityName, String country)

	{

		this.cityName=cityName;

		this.country=country;

		Stud s=new Stud("Swarna",this ); //this has been passed as an argument in constructor

		s.display();

	}
}
public class ThisAsArgumentInConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("Bangalore" , "India");


	}

}
