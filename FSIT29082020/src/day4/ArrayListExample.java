package day4;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();

		list.add("apple");

		list.add("Mango");

		list.add("Mango");

		list.add("Orange");

		list.add("Grapes");

		list.add("Banana");



		//Traverse the list



		Iterator res =list.iterator();

		while(res.hasNext())

		{

			System.out.println(res.next());

		}

			

			

			list.remove(2);

			System.out.println("*********************");

			 res =list.iterator();

			while(res.hasNext())

			{

				System.out.println(res.next());

			}	

	}

}
