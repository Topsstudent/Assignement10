package module1;

public class Copyarray {
public static void main(String[] args) {
	int a[]= new int[] {1,2,3,4};
	int b[]= new int[a.length];
	b=a;
	b[0]++;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
		//b[i]=a[i];
	}
	System.out.println();
	for(int i=0;i<a.length;i++) {
	System.out.println(b[i]+" ");
	}
	//System.out.println();
}
}
