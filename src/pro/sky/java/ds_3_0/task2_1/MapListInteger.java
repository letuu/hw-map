package pro.sky.java.ds_3_0.task2_1;

import java.util.*;

public class MapListInteger {

    private static final int sizeList = 3;
    private Map<String, List> map = new HashMap<>();

    public static Map<String, Integer> listToInteger(Map<String, List> mapList) {
        Map<String, Integer> mapInt = new HashMap<>();
        for (Map.Entry<String, List> keyValue : mapList.entrySet()) {
            int multiplicationValue = 1;
            for (int i = 0; i < sizeList; i++) {
                multiplicationValue *= (int) keyValue.getValue().get(i);
            }
            mapInt.put(keyValue.getKey(), multiplicationValue);
        }
        return mapInt;
    }

    public static List<Integer> generateRandomList() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < sizeList) {
            list.add(random.nextInt(1000));
        }
        return list;
    }
}
