package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedli {
public static void main(String[] args) {
	LinkedList<Object> ll= new LinkedList<>();
	ll.add("Sanket");
	ll.add("Pidurkar");
	ll.add("Ballarpur");
	ll.add(73);
	ll.add(21);
	ll.add("tester");
	ll.remove(2);
	ll.add("Ballarpur");
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	
	System.out.println(ll);
	System.out.println("==============for loop============");
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
	System.out.println("==============iterator&Whileloop============");
	Iterator<Object> it = ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("==============listiterator&Whileloop============");
	ListIterator<Object> li = ll.listIterator();
	li.add("Velocity");
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("==============object for loop============");
	for(Object o:ll) {
		System.out.println(o);
	}
}
}
