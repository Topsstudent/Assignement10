package module1;

import java.util.HashSet;
import java.util.Iterator;

public class Prac12 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	System.out.println(h1);
	System.out.println(h1.size());
	h1.add(10);
	h1.add('s');
	System.out.println(h1);
	System.out.println(h1.size());
	
	Iterator i1=h1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
}
}
