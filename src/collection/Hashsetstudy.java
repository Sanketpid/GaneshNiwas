package collection;

import java.util.HashSet;
import java.util.Iterator;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Hashsetstudy {

	public static void main(String[] args) {
		
		HashSet<Object> h= new HashSet<>();
		h.add("sanket");
		h.add("shubham");
		h.add(12.32);
		h.add(123.14);
		h.add(23);
		h.add('a');
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.toString());
		
		System.out.println("======================//iterrator//================");
		Iterator<Object> it = h.iterator();
		while (it.hasNext()) {
			System.out.println( it.next());
			
		}
		System.out.println("======================//For each loop//================");
		for(Object o:h) {
			System.out.println(o);
		}

	}

}
