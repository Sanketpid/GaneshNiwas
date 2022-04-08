package collection;

import java.util.Vector;

public class vect2 {
public static void main(String[] args) {
	Vector<Object> v= new Vector<>();
	v.add("sanket");
	try {
		v.add(2,"Chandrapur");
	} 
	catch (Exception e) {
		System.out.println("Exception we are geting:"+e.getMessage());
	}
	finally {
		v.add("Pidurkar");
		v.add(27);
		v.add(83);
		v.add("Ballarpur");
		v.add("Techmahindra");
		v.add(1, null);
		v.add(2,"Chandrapur");
		System.out.println(v);
	}
	
}
}
