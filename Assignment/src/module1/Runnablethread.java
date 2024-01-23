package module1;

public class Runnablethread implements Runnableinterface{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=1;i<=5;i++) {
		System.out.println("second thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Demo{
	public static void main(String[] args) {
		Runnablethread r=new Runnablethread();
		Thread t1=new Thread();
		t1.start();
		System.out.println(t1.isAlive());
		for(int i=1;i<=5;i++) {
			System.out.println("second thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		
	}
		System.out.println(t1.isAlive());
}


}}
