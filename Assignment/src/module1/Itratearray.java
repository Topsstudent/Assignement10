package module1;

import java.util.ArrayList;
import java.util.Iterator;

public class Itratearray {
public static void main(String[] args) {
	ArrayList<Integer> i1=new ArrayList<Integer>();
	i1.add(12);
	//i1.add("hello");
	//i1.add(1.2f);
	i1.add(4);
	i1.add(123);
	i1.remove(2);
	
	System.out.println(i1);
	System.out.println("size is:" + i1.size());
	Iterator<Integer> a1= i1.iterator();
	while(a1.hasNext()) {
		System.out.println(a1.next());
	}
}
}
