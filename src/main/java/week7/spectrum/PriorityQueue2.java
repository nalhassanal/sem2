package week7.spectrum;

import java.util.*;

public class PriorityQueue2 {
  public static void main(String[] args) {
	  // higher value higher priority
	PriorityQueue<Customer> customerQueue
	  = new PriorityQueue<>(Collections.reverseOrder());

	// sort by id not name
	customerQueue.add(new Customer(3, "Donald" ));
	customerQueue.add(new Customer(1, "Chong" ));
	customerQueue.add(new Customer(2, "Ali" ));
	customerQueue.add(new Customer(4, "Bala" ));

	// will return the highest priority without removing it from queue
	Customer c = customerQueue.peek();
	if (c!=null) {
		System.out.println(c.getName() + " is in queue");
		while ((c = customerQueue.poll())!=null)
			System.out.println(c);
	}
    System.out.println();
  }
}

