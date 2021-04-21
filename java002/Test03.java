package java002;

import java.sql.Time;

public class Test03 implements Runnable {
	public static void main(String args[]) {
		Test03 t = new Test03();
		Thread tt = new Thread(t);
		tt.start();
	}

	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException  e) {
			}
			System.out.println("Hello");
		}
	}
}
