package module1;

import java.util.Scanner;

class Sachinexception extends Exception{
	double amount;
	public Sachinexception (double amount) {	this.amount=amount;}}
class Atm{
	Double balance;
	public void deposit(Double amount) {	balance=amount+balance;
		System.out.println("your total bslance is :"+balance);
	}public void withdraw (double amount)  {

		if(amount<balance) {
			balance=amount-balance;
			System.out.println("your total balance is:"+balance);
			}else {double needs=amount-balance;
			//throw new Sachinexception(needs);
			}}	}
public class Customexception {
public static void main(String[] args) {
	Atm atm= new Atm();
	double amount;
	Scanner sc= new Scanner(System.in);
	amount =sc.nextDouble();
	System.out.println("enter amount to be withdrawn");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch ( ArithmeticException e) {
		// TODO: handle exception
	
}
}}
