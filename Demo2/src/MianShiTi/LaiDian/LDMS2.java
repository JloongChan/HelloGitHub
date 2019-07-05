package MianShiTi.LaiDian;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程按顺序执行输出 A B C
 */
public class LDMS2 {

	static int index = 0;
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

	private static final ReentrantLock lock = new ReentrantLock(true);

	private int value;
	private String name;

	Ta(int value, String name) {
		this.value = value;
		this.name = name;
	}

	@Override
	public void run() {
		for (;;) {
			try {
				lock.lock();
				if (LDMS2.index >= LDMS2.max) {
					break;
				}
				if (LDMS2.index % 3 == value) {
					System.out.println(name);
					++LDMS2.index;
				}
			} finally {
				lock.unlock();
			}
		}
	}
}