package Nov.ex22112024_MapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task_Hashmap_ArrayList {
    public static void main(String[] args) {

        HashMap<String,String> s1 = new HashMap<>();
        s1.put("name","Poonam");
        s1.put("roll","1");
        s1.put("pno","64563456");
        System.out.println(s1);

        HashMap<String,String> s2 = new HashMap();
        s2.put("name","amit");
        s2.put("roll","2");
        s2.put("pno","5235345");
        System.out.println(s2);

        List Student = new ArrayList();
        Student.add(s1);
        Student.add(s2);
        System.out.println(Student);
    }
}
//output
//{pno=64563456, name=Poonam, roll=1}
//        {pno=5235345, name=amit, roll=2}
//        [{pno=64563456, name=Poonam, roll=1}, {pno=5235345, name=amit, roll=2}]