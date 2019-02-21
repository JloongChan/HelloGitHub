package hoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class demo1 {

    public static void main(String[] args){
        List<String> lists = new ArrayList<String>(2);
        lists.add("1");
        lists.add("1");
        lists.add("1");
        lists.add("1");
        lists.add("1");
        lists.add("1");

        String[] str2 = {"1", "2", "3"};
        System.out.println(str2.getClass().getComponentType());

        List<String> list2 = new ArrayList<>();
        String[] str3 = {"1", "1", null, "1", "1", "1", "1", "1", "1", "1"};
        String[] str4 = list2.toArray(str3);
        System.out.println(str4);

        int n = 32;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);

        /* 生成四位随机数字 */
        String str="0123456789";
        Random r = new Random();
        String arr[] = new String [4];
        StringBuffer b = new StringBuffer();
        for(int i=0; i < 4; i++)
        {
            int x = r.nextInt(10);
            arr[i] = str.substring(x,x+1);
            b.append(arr[i]);
        }

        A[] as = {new A(), new B(), new C()};
        for(A a : as){
            System.out.println(a.name());
        }

    }
}

class A{
    String name(){ return "A";}
}

class B extends A{
    @Override String name(){ return "B";}
}

class C extends A{
    @Override String name(){ return "C";}
}



