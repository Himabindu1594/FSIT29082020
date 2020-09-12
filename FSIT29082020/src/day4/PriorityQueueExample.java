package day4;

import java.util.Iterator;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new  PriorityQueue<Integer>();

		queue.add(1000);

		queue.add(200);

		queue.add(400);

		queue.add(800);

		queue.add(400);





		System.out.println("Head " + queue.element()); //prints the top element in the queue

		System.out.println("Head " + queue.peek());



		System.out.println("*********************");



		Iterator<Integer> itr =queue.iterator();

		while(itr.hasNext())

		{

		System.out.println(itr.next());	

		}



		System.out.println("************************");
		
		//Remove values from the queue



		queue.remove(); //this removes the first element in the queue

		queue.poll();  //this removes the first element in the queue

		System.out.println("After removing 2 elements");



		System.out.println("*********************");



		 itr =queue.iterator();

		while(itr.hasNext())

		{

		System.out.println(itr.next());	

		}

	}

}
