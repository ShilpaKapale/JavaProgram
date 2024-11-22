package Nov.ex22112024_MapCollection;

import java.util.HashMap;
import java.util.Map;

public class Task_MapGeneric {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap();

        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",null);
        map.put(null,102);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));
    }
}
//OUTPUT
//{null=102, id2=2, id3=null, id=2}
//4
//        false
//        true
//        [null, id2, id3, id]
//        [102, 2, null, 2]
//        null