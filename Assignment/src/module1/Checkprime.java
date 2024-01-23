package module1;

public class Checkprime {
	public static void main(String[] args) {
	//	int flag=0;
		int s=1;
		int last=100;
		int sum=0;
		for(int i=s;i<=last;i++) {
			int flag=0;
		for(int j=1;j<=i;j++) {
		if(i%j==0) {
			flag++;
		}
		}
		if(flag==2) {
			System.out.println("no is prime number"+i);
		sum=sum+i;
		System.out.println(sum);
		}}}}
		
	
		
		
		
		
		
		
		
	