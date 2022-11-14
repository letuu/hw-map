package pro.sky.java.ds_3_0.task1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main13 {

    private static final Map<String, Integer> map = new HashMap<>(Map.of(
                "str1", 1,
                "str2", 2,
                "str3", 3,
                "str4", 4,
                "str5", 5));

    public static void main(String[] args) {

        System.out.println();

        map.put("str6", 1);
        System.out.println(map);

        addMap("str7", 1);          //Если такого ключа нет - добавляем
        System.out.println(map);
        addMap("str7", 77);         //Если такой ключ есть, но значения разные - обновляем значение
        System.out.println(map);
        addMap("str7", 77);         //Если такой ключ есть и значения совпадают - кидаем исключение
        System.out.println(map);

    }

    public static void addMap(String key, Integer value) {
        for (Map.Entry<String, Integer> keyValue : map.entrySet()) {
            if (keyValue.getKey().equals(key) && Objects.equals(keyValue.getValue(), value)) {
                throw new RuntimeException("Такой элемент уже добавлен");
            }
        }
        map.put(key, value);
    }
}
