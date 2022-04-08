package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetstud {
public static void main(String[] args) {
	TreeSet<Integer> ts= new TreeSet<>();
	ts.add(4);
	ts.add(3);
	ts.add(1);
	ts.add(2);
	ts.add(4);
	System.out.println(ts);
	//System.out.println(ts.pollFirst());
	//System.out.println(ts.pollLast());
	System.out.println("==================//Each loop//==============");
	for(Object o:ts) {
		System.out.println(o);
	}
	System.out.println("==================//While Iterator//==============");
	Iterator<Integer> it = ts.iterator();
	while (it.hasNext()) {
		
		System.out.println(it.next());
		
	}
	
	
}
}
