package hoo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch c1 = new CountDownLatch(5);
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("while");
				c1.countDown();
			}
		}).start();
		c1.await();
		System.out.println("bingo");

		new Thread(() -> System.out.println(1));
	}
}
