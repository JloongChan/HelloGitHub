package MianShiTi;

import java.util.Date;

public class ms6 extends Date{

	static int a = 0;
	public static void main(String[] args) {
		new ms6().test();
	}
	
	public void test(){
		String s = this.getClass().getName() +", "+ super.getClass().getName();
		System.out.println(s);
		/** 输出：MianShiTi.ms6, MianShiTi.ms 6**/ 
		/** Class<? extends Date> java.lang.Object.getClass() 返回Date的某子类 **/
	}
}

class m extends Date{
	
}