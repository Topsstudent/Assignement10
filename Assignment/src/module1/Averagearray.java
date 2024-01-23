package module1;

import java.util.Scanner;

public class Averagearray {
public static void main(String[] args) {
	int [] b= new int [5];
	int sum=0;
	double avg=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter elements");
	for(int i=0;i<b.length;i++) {
	b[i]=sc.nextInt();
	System.out.println(b[i]);
	sum=sum+b[i];
	avg=sum/5.0;
	//1System.out.println(avg);
	}
	System.out.println(avg);
	
}}





/*Scanner s= new Scanner(System.in);
System.out.println("enter array elemets");
for(int i=0;i<b.length;i++) {
	b[i]=s.nextInt();

	//System.out.println(b[i]);
}
for(int i=0;i<b.length;i++) {
	System.out.println("array elements;"+b[i]);
	sum=b[i]+sum;
	System.out.println(sum);
	
}
avg=sum/5.0;
System.out.println("average is:"+avg);
}
}
*/