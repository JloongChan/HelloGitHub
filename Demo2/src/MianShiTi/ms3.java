package MianShiTi;

public class ms3 {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
		/** Êä³ö£ºAB,B **/
	}
	
	static void operate(StringBuffer a, StringBuffer b){
		a.append(b);
		a = b;
	}
}
