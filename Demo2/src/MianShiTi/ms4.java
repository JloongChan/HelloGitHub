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
	/** 输出B，然后抛出的Error异常没捕获到（Error是Exception的父类），所以程序退出 **/
}
