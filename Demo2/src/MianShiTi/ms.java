package MianShiTi;

public class ms {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		for(i=0 ;i<10; i++){
			if(i%2 == 0){
				continue;
			}
			for(j=0; j<10; j++){
				if(j==5){
					break;
				}
			}
		}
		System.out.println(i +"  "+ j);
		/** 最简单的一题    10 5 **/
		
		
		String s1 = "hello";
		String s2 = "he" + new String("llo");
		System.out.println(s1 == s2);
		/** 比较地址，String存在字符串常量池 **/
	}
	
}
