package module1;
abstract class Parent{
	public abstract void message();}
	
	class Child1 extends Parent{
		@Override
		public void message() {
			// TODO Auto-generated method stub
			System.out.println("this is first class");
		}
	}
	
class Child2 extends Parent{
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("this is second class ");
	}
}

public class Abstarcto1 {
public static void main(String[] args) {
	Child1 ch1=new Child1();
	ch1.message();
	Child2 ch2= new Child2();
	ch2.message();
}
}
