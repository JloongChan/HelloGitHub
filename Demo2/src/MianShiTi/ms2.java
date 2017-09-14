package MianShiTi;

public class ms2 {
	int a=0;
	int b=0;
	B b1 = new B(3, 4);
	public ms2(int a, int b){
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		ms2 a = new ms2(3, 4);
	}
		
}

class B{
	int a=0;
	int b=0;
	ms2 a1 = new ms2(3,4);
	public B(int a, int b){
		this.a=a;
		this.b=b;
	}
}

/** 6,20死循环调用，导致栈溢出！ **/