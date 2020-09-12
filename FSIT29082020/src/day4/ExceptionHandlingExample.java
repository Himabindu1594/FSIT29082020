package day4;

/*demo of ArthmeticException and ArrayIndexOutOfBound exception

 * 

 */



public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=100;

		int a[]=new int[3];



				try //monitors the run time erros..if error occurs control shifted to catch block

				{

					System.out.println("Hello How are you?");

					a[4]=1000;

					

				}catch(ArrayIndexOutOfBoundsException a1) {

					System.out.println("Please check your array index value");

				}

			

				try

				{

					System.out.println(data/0);

				}

				catch(ArithmeticException e) { //looks for ASSOCIATED catch block otherwise control goes to the catch where Exception defined

					System.out.println("Exception Occured");

				}

				

					finally //runs after the try and catch block..generally helps to release the resources

				{

					System.out.println("I am from finally block");
				}
				System.out.println("Rest of code");

	}

}
