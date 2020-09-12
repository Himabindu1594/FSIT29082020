package day4;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" Apple";

		String s2= "I Like";

		String s3= new String("apple");



		System.out.println(s2.concat(s1));

		System.out.println(s1.equals(s3));

		System.out.println(s1.equalsIgnoreCase(s3));

		System.out.println(s1.toLowerCase());

		System.out.println(s1.toUpperCase());

		System.out.println(s2.concat(s1.trim()).trim());

		System.out.println(s1.substring(2,4));

	}

}
