package MianShiTi;

public class ms4 {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("C");
		}finally{
			System.out.println("B");
		}
		System.out.println("D");
	}
	
	static void badMethod(){
		throw new Error();
	}
	/** ���B��Ȼ���׳���Error�쳣û���񵽣�Error��Exception�ĸ��ࣩ�����Գ����˳� **/
}
