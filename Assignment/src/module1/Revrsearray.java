package module1;

public class Revrsearray {
public static void main(String[] args) {
	int []a= new int[] {1,2,3,4};
	System.out.println("original array");
	for(int i=0;i<=a.length;i++) {
		System.out.println(i);
	}
	System.out.println("revrse order");
	for(int i=a.length;i>=0;i--) {
		System.out.println(i);
	}
}
}
