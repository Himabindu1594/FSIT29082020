package day2;

public class InfiniteForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;



		sample:

			for(;;)//Infinite number of times

			{

				if(counter>1000)

					break sample;

				System.out.println("Welcome Swarna " + counter);



				counter++;		

			}



	}

}
