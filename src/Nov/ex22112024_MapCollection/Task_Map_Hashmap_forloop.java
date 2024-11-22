package Nov.ex22112024_MapCollection;

import java.util.HashMap;
import java.util.Map;

public class Task_Map_Hashmap_forloop {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap();
        map1.put("id",1);
        map1.put("id2",2);
        map1.put("id3",null);
        map1.put(null,100);

        for (Map.Entry<String,Integer> item: map1.entrySet())
        {
            System.out.println(item.getKey() + item.getValue());
        }
    }
}
//OUTPUT
// null100
//id22
//id3null
//id1