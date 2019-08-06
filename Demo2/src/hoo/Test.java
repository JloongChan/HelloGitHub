package hoo;

public class Test {
	public static void main(String[] args) {
		/*String ss = "213123;http://is2.qfangimg.com/shenzhen/broker/2015/8/18/1200x900/28d4b6d7-676b-4a30-aab0-5d57f995177d.JPG?style=hk&tailor=false;dsfasdfasd;http://is2.qfangimg.com/broker/2015/8/18/1200x900/28d4b6d7-676b-4a30-aab0-5d57f995177d.JPG?style=hk&tailor=false";
		String s = "http://is2.qfangimg.com/shenzhen/broker/2015/8/18/1200x900/28d4b6d7-676b-4a30-aab0-5d57f995177d.JPG?style=hk&tailor=false";
		System.out.println(s.substring(0, s.length() - 1));
		System.out.println(s.split("\\?")[0]);
		System.out.println(ss.contains(s.split("\\?")[0]));

		System.out.printf("dafd %s,%s,%sfsdfsd %d", "aa","vv","cc", 1);*/

		String s = new String("nnnnnnsndnfnasaf\ndfsd\nfsd");
		System.out.println(s.replaceAll("\n", "<br>"));
	}
}
