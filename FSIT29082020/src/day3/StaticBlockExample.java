package day3;

public class StaticBlockExample {
	

		static int data;

		static {

		data=100;

		System.out.println("1. The value of the data is = "+ data);

		}

		static {

		data=200;

		System.out.println("2. The value of the data is = "+ data);

		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("3. The value of the data is = "+ data);

	}

}
