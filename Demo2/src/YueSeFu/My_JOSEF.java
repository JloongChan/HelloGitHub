package YueSeFu;

import java.util.LinkedList;
import java.util.List;

public class My_JOSEF {
	
	/**
	 * 
	 * 分析：
	 * 1、先根据具体人数生成一个List，并且每个值代表某人的编号。
	 * 2、计算将杀之人的index，将杀到的人移除出List。
	 * 3、最终结果是全部人死亡，所以循环List的长度次数2步骤杀人。
	 * 
	 */
	
	public static final int N = 1000000; //定义人数
	public static final int M = 6; //定义第M个人被杀
	
	public int a= 1;
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for(int i=1; i<=N; i++){
			list.add(String.valueOf(i));
		}
		long begin = System.currentTimeMillis();
		kill(list, M);
		long end = System.currentTimeMillis();
		System.out.println("My_JOSEF 此次任务所消耗毫秒数：" + (end - begin));
	}
	
	public static void kill(List<String> list, int M){
		int size = list.size();
		int index = 0;
		for(int i=0; i<size; i++){
			if((index + M) >= list.size()){
				index = (index + M - 1) % list.size();
			}else{
				index = index + M - 1;
			}
			System.out.println("本轮被杀的人是 "+ (list.get(index)) +" 号");
			list.remove(index);
			index = index == list.size() ? 0 : index;
		}
	}

}
