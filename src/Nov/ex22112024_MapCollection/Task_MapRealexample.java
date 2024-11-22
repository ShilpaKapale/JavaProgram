package Nov.ex22112024_MapCollection;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task_MapRealexample {
    public static void main(String[] args) {

        Map<String,Object> s = new HashMap();
        s.put("name","Deepa");
        s.put("phno","6545645");
        s.put("address","Banglore");
        System.out.println("Map: "+s);

        Set book = new HashSet();
        book.add("Rich Poor");
        book.add("Secret");
        System.out.println("Set: "+book);
    }
}
