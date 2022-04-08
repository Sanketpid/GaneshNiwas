package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhash {
public static void main(String[] args) {
	LinkedHashSet<Object> lh= new LinkedHashSet<>();
	lh.add("Sanket");
	lh.add("Pidurkar");
	lh.add("Ballarpur");
	lh.add("Ballarpur");
	lh.add(23);
	lh.add(null);
	lh.add(null);
	lh.add(89.45);
	System.out.println(lh);
	System.out.println("======================//iterrator//================");
	Iterator<Object> it = lh.iterator();
	while (it.hasNext()) {
		System.out.println( it.next());}
	System.out.println("======================//iterrator//================");
	for(Object o:lh) {
		System.out.println(o);
	}
}
}
