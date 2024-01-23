package module1;

import java.util.Scanner;

public class Greatestno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("enter a");
	a=sc.nextInt();
	System.out.println("enter b");
	b=sc.nextInt();
	System.out.println("enter c");
	c=sc.nextInt();
	//System.out.println("enter greatest no");
	if(a>b && a>c) {
		System.out.println("print a:"+a);
	}
	if(b>c) {
		System.out.println("print b:"+ b);
	}
	
	else {
		System.out.println("print c:"+ c);
	}
}
}
