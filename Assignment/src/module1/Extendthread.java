package module1;

import java.security.PublicKey;
class Fun extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("first thread running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}}}
public class Extendthread {
public static void main(String[] args) {
Fun f= new Fun();
f.start();
Thread t1= Thread.currentThread();
t1.setName("s");
for(int i=0;i<=5;i++) {
	System.out.println("second thread running");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
}

}
}
