package YueSeFu;

public class JOSEF_Demo {

	/**
	 * 
		������
		��1�����ڶ���ÿ����ֻ�����ͻ�����״̬����˿����ò�����������ÿ���˵�״̬������true��ʾ����false��ʾ�
		��2����ʼʱÿ���˶��ǻ�ģ����������ֵȫ����Ϊfalse��
		��3��ģ��ɱ�˹��̣�ֱ�������˶���ɱ��Ϊֹ��
		*��ʾ���÷��������԰ٶȰٿ� Լɪ�����⣡
	 *
	 */
	
	public static final int N = 6; //��������
	public static final int M = 5; //�����M���˱�ɱ
	
	public static void main(String[] args) {
		boolean[] arrs = new boolean[N];
		long begin = System.currentTimeMillis();
		kill(arrs, 0);
		long end = System.currentTimeMillis();
		System.out.println("JOSEF_Demo �˴����������ĺ�������" + (end - begin));
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
			System.out.println("���ֱ�ɱ������ "+ (index+1) +" ��");
		}
	}
}
