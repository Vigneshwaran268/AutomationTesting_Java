package Tree_Map;

import java.util.Map;
import java.util.TreeMap;

public class StudentsMarks {

    public static void main(String[] args) {

        TreeMap<Integer, String> marks = new TreeMap<>();
        marks.put(88,"Vikki");
        marks.put(100,"Swathy");
        marks.put(54,"Kumar");
        marks.put(46,"Viswa");
        marks.put(35,"Sam");
        System.out.println(marks.firstKey());
        System.out.println(marks.lastKey());
        System.out.println(marks.higherKey(88));
        System.out.println(marks.lowerKey(46));
        System.out.println(marks.keySet());


    }
}
