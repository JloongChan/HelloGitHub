package MianShiTi.LaiDian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LDMS3 {

	public static String exchange(int[] arr) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList();
		for (int each : arr) {
			if (each % 2 == 0)
				b.add(each);
			else
				a.add(each);
		}
		Collections.sort(a);
		Collections.sort(b);
		a.addAll(b);
		return Arrays.toString(a.toArray());
	}

	public static void main(String[] args) {
		int arr[] = {1,5,6,4,3,12,2,7,9,8};
		System.out.println(exchange(arr));
	}

}
