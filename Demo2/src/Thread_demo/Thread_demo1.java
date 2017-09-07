package Thread_demo;

public class Thread_demo1 {

	public static Integer product = 0;
	
	public static Thread producer_t1 = new Thread(new Runnable(){

		@Override
		public void run() {
			while(true){
				product++;
				System.out.println("生产：product = " + product);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	});
	
	public static Thread comsumer_t2 = new Thread(new Runnable(){

		@Override
		public void run() {
			while(true){
				synchronized (product) {
					if(product >0 ){
						product--;
						System.out.println("消费：product = " + product);
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	
	public static void main(String[] args) {
		producer_t1.start();
		comsumer_t2.start();
	}
	
}
