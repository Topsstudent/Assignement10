package module1;

public class Armstrongnumber {
	public static void main(String[] args) {
		int a=152,rem,cube,sum=0,num=a;
		while(a!=0) {
			rem=a%10;
			cube=(int)Math.pow(rem,3);
			a=a/10;
			sum=cube+sum;
			
			}
		if(num==sum) {
			System.out.println("it is armstrong number");
		}else {
			System.out.println("it is not armstrong number");
		}
	}
}


/*int no=153,cube,rem,sum=0,num=no;
while(no!=0) {
	rem=no%10;
	cube=(int)Math.pow(rem,3);
	no=no/10;
	sum=sum+cube;
}
if(num==sum) {
	System.out.println("it is armstrong number");
}else {
	System.out.println("it is not armstrong number");
}
*/






