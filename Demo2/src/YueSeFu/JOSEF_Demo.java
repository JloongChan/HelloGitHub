package YueSeFu;

public class JOSEF_Demo {

	/**
	 * 
		分析：
		（1）由于对于每个人只有死和活两种状态，因此可以用布朗型数组标记每个人的状态，可用true表示死，false表示活。
		（2）开始时每个人都是活的，所以数组初值全部赋为false。
		（3）模拟杀人过程，直到所有人都被杀死为止。
		*提示：该分析复制自百度百科 约瑟夫问题！
	 *
	 */
	
	public static final int N = 6; //定义人数
	public static final int M = 5; //定义第M个人被杀
	
	public static void main(String[] args) {
		boolean[] arrs = new boolean[N];
		long begin = System.currentTimeMillis();
		kill(arrs, 0);
		long end = System.currentTimeMillis();
		System.out.println("JOSEF_Demo 此次任务所消耗毫秒数：" + (end - begin));
	}
	
	public static void kill(boolean[] arrs, int index){
		for(int i = 0; i < arrs.length; i++){
			int n = 0;
			while(n < M){
				if(!arrs[index]){
					n++;
				}
				if(n != M){
					index = (index == arrs.length - 1)? 0 : ++index;
				}
			}
			arrs[index] = true;
			System.out.println("本轮被杀的人是 "+ (index+1) +" 号");
		}
	}
}
