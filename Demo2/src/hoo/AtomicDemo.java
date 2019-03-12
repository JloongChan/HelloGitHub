package hoo;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {

	public static void main(String[] args){
		AtomicLong l = new AtomicLong(1L);
		l.getAndIncrement();
	}
}
