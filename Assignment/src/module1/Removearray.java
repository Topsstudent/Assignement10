package module1;

import java.util.ArrayList;

public class Removearray {
public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add("hello");
	System.out.println(a1);
	a1.remove(2);
	System.out.println(a1);
}
}
