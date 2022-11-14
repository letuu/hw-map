package pro.sky.java.ds_3_0.task2_1;

import java.util.*;

public class Main21 {

    private static final int size = 3;
    public static void main(String[] args) {

        MapListInteger mapListInteger = new MapListInteger();
        List<Integer> list1 = MapListInteger.generateRandomList();
        List<Integer> list2 = MapListInteger.generateRandomList();
        List<Integer> list3 = MapListInteger.generateRandomList();
        List<Integer> list4 = MapListInteger.generateRandomList();
        List<Integer> list5 = MapListInteger.generateRandomList();

        //через метод внутри этого класса, можно и так
        List<Integer> list10 = generateRandomListMain();
        System.out.println("list10: " + list10);


        Map<String, List<Integer>> mapList = new HashMap<>(Map.of(
                "str1", list1,
                "str2", list2,
                "str3", list3,
                "str4", list4,
                "str5", list5));

        System.out.println(mapList);

        Map<String, Integer> mapInt1 = MapListInteger.listToInteger(mapList);
        System.out.println(mapInt1);

    }

    public static List<Integer> generateRandomListMain() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < size) {
            list.add(random.nextInt(1000));
        }
        return list;
    }
}
