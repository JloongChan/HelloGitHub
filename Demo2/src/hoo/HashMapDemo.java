package hoo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashMapDemo {

    /**
     *   C9 跟 Aw hash值一样，所以插到map后所在的数组位置是一样的！
     **/
    public static void main(String[] args){
        /**
         *
         */
        Map<String, Object> map = new HashMap<>(8);
        map.put("C9", "C9");
        map.put("Aw", "Aw");
        map.put("Aw1", "Aw1");


        /**
            Entry 后插入的排前面，每次自动扩容后，会把Entry后前颠倒
        **/
        Map<String, Object> map2 = new WeakHashMap(8);
        map.put("C9", "C9");
        map.put("Aw", "Aw");
        map.put("Aw1", "Aw1");


        LinkedHashMap aa = new LinkedHashMap(8);
        aa.put("C9", "C9");
        aa.put("Aw", "Aw");
        aa.put("Aw1", "Aw1");
        System.out.println();

        // master commit

        System.out.println(map);
    }
}
