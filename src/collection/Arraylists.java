package collection;

import java.util.ArrayList;
//import java.util.Iterator;

public class Arraylists {
public static void main(String[] args) {
	ArrayList<Object> al= new ArrayList<>();
	al.add("Sanket");
	al.add("Pidurkar");
	al.add(null);
	al.add(123.123);
	al.add(73);
	al.add("Chandrapur");
	al.add('A');
	
	//al.add(al);
	//al.addAll(al);
	al.ensureCapacity(1);
	System.out.println(al);
//	System.out.println("=========forloop1=========");
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
//	ArrayList<Object> al1= new ArrayList<>();
//	al1.add("Swaraj");
//	al1.add("Pidurkar");
//	al1.add(null);
//	al1.add(124.123);
//	al1.add(75);
//	al1.add("Ballarpur");
//	al1.add('B');
//	al1.add(null);
//	System.out.println(al1);
//	System.out.println(al.addAll(0, al1));
//	al.addAll(al1);
//	System.out.println("=========forloop2=========");
//	for(int i=0;i<al.size();i++) {
//		System.out.println(al.get(i));
//	}
//	System.out.println("=======Iterator&whileloop======");
//	Iterator<Object> it=al.iterator();
//	
//	while(it.hasNext()) {
//		System.out.println(it.next());
//		}
//	System.out.println("=======For loop and object class======");
//	for(Object o:al)
//	{
//		System.out.println(o);
//	}
	
}
}
