package collection;

import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Vector;

public class Vect {

	public static void main(String[] args) {
		Vector<Object> v= new Vector<>();
		v.add("sanket");
		
		v.add("Pidurkar");
		v.add(27);
		v.add(83);
		v.add("Ballarpur");
		v.add("Techmahindra");
		v.add(1, null);
		v.add(2,"Chandrapur");
		System.out.println(v);
		System.out.println("================Methods==================");
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(0));
		System.out.println(v.firstElement());
		
//		System.out.println("================for loop==================");
//		for(int i=0;i<v.size();i++) {
//			System.out.println(v.get(i));
//		}
//		System.out.println("================iterator & while loop==================");
//		Iterator<Object> it = v.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	   System.out.println("================listiterator & while loop==================");
//       ListIterator<Object> li = v.listIterator();
//       while(li.hasNext()) {
//    	   System.out.println(li.next());
//       }
       System.out.println("================Object for loop==================");
       for(Object o:v) {
    	   System.out.println(o);
       }
       System.out.println("================Enumeration& while==================");
      Enumeration<Object> en = v.elements();
      while(en.hasMoreElements()) {
    	  System.out.println(en.nextElement());
      }
	}

}
