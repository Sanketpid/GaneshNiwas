package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Que {
public static void main(String[] args) {
	PriorityQueue<Object> pq= new PriorityQueue<>();
	pq.add("Sanket");
	pq.add("Swaraj");
	pq.add("Shubham");
	pq.add("Sachin");
	System.out.println(pq);
	System.out.println("==================//methods//=================");
//	System.out.println(pq.peek());
//	System.out.println(pq.poll());
//	System.out.println(pq.size());
//	
	System.out.println("==================//each loop//=================");
	for(Object o:pq) {System.out.println(o);}
	System.out.println("==================//iterator//=================");
    Iterator<Object> it = pq.iterator();
    while(it.hasNext()) {System.out.println(it.next());}
}
}
