package module1;

import java.util.ArrayList;

public class Updatearray {
public static void main(String[] args) {
	ArrayList array= new ArrayList();
	array.add(10);
	array.add(20);
	array.add("hello");
	System.out.println(array);
	array.set(2, "bye");
	System.out.println(array);
}
}
