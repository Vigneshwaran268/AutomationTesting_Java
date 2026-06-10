package Tree_Map;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class TrainNumbers {

    public static void main(String[] args) {

        TreeMap<Integer, String> train = new TreeMap<>();
        train.put(32157, "Pothigai");
        train.put(39873, "Kollam");
        train.put(32167, "Punalur");
        train.put(32222, "Intercity");
        System.out.println(train);
        System.out.println(train.ceilingKey(32156));
        System.out.println(train.floorKey(32223));
        System.out.println(train.higherKey(32223));
        System.out.println(train.lowerKey(32167));

    }
}
