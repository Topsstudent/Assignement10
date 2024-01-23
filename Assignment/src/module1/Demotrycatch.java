package module1;

import java.util.Scanner;

public class Demotrycatch {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
System.out.println("eter the value");
	int []a=new int[5];
	for(int i=0;i<=a.length;i++) {
		
		try {
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
}
