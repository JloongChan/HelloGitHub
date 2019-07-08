package MianShiTi.LaiDian;

public class LDMS2_2 implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    private LDMS2_2(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        LDMS2_2 pa = new LDMS2_2("A", c, a);
        LDMS2_2 pb = new LDMS2_2("B", a, b);
        LDMS2_2 pc = new LDMS2_2("C", b, c);

        new Thread(pa).start();
        Thread.sleep(10);
        new Thread(pb).start();
        Thread.sleep(10);
        new Thread(pc).start();
        Thread.sleep(10);
    }
}