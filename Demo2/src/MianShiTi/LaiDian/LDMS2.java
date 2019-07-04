package MianShiTi.LaiDian;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程按顺序执行输出 A B C
 */
public class LDMS2 {

	static int count = 0;
	static int max = 30;
	public static void main(String[] args) {
		Ta a = new Ta(0, "A");
		Ta b = new Ta(1, "B");
		Ta c = new Ta(2, "C");
		a.start();
		b.start();
		c.start();
	}
}

class Ta extends Thread {

	private static final ReentrantLock lock = new ReentrantLock();

	private int value;
	private String name;

	Ta(int value, String name) {
		this.value = value;
		this.name = name;
	}

	@Override
	public void run() {
		for (;;) {
			lock.lock();
			if (LDMS2.count % 3 == value) {
				System.out.println(name + " " + LDMS2.count);
				++LDMS2.count;
			}
			lock.unlock();
			try {
				Thread.sleep(10);	// 小憩一会，避免提前竞争锁
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (LDMS2.count >= LDMS2.max) {
				break;
			}
		}
	}
}