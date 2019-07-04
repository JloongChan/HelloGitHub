package MianShiTi.LaiDian;

public class LDMS1 {

	static boolean print(String value) {
		System.out.printf(value);
		return true;
	}

	public static void main(String[] args) {
		int i = 0;
		for (print("A"); i < 2 && print("B"); print("C")) {
			print("D");
			i++;
		}
	}
}
