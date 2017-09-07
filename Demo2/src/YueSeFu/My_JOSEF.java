package YueSeFu;

import java.util.LinkedList;
import java.util.List;

public class My_JOSEF {
	
	/**
	 * 
	 * ������
	 * 1���ȸ��ݾ�����������һ��List������ÿ��ֵ����ĳ�˵ı�š�
	 * 2�����㽫ɱ֮�˵�index����ɱ�������Ƴ���List��
	 * 3�����ս����ȫ��������������ѭ��List�ĳ��ȴ���2����ɱ�ˡ�
	 * 
	 */
	
	public static final int N = 1000000; //��������
	public static final int M = 6; //�����M���˱�ɱ
	
	public int a= 1;
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for(int i=1; i<=N; i++){
			list.add(String.valueOf(i));
		}
		long begin = System.currentTimeMillis();
		kill(list, M);
		long end = System.currentTimeMillis();
		System.out.println("My_JOSEF �˴����������ĺ�������" + (end - begin));
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
			System.out.println("���ֱ�ɱ������ "+ (list.get(index)) +" ��");
			list.remove(index);
			index = index == list.size() ? 0 : index;
		}
	}

}
