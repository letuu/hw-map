package pro.sky.java.ds_3_0.task2_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main22 {
    public static void main(String[] args) {

        //Коллекция, в которой сохраняется порядок добавления элементов,
        //но при массовом заполнении элементов порядок не сохраняется
        Map<Integer, String> map = new LinkedHashMap<>((Map.of(
                1,"str1",
                2,"str2",
                3,"str3",
                4,"str4",
                5,"str5",
                6,"str6",
                1000,"str1000",
                8,"str8",
                9,"str9",
                7,"str7")));

        System.out.println();
        System.out.println(map);    //порядок при таком заполнении не сохраняется
        System.out.println();

        //Коллекция, в которой сохраняется порядок добавления элементов
        Map<Integer, String> mapOrder = new LinkedHashMap<>();

        mapOrder.put(1, "string1");
        mapOrder.put(1, "string11111"); //такой ключ уже есть - значение перезаписывается
        mapOrder.put(2, "string2");
        mapOrder.put(3, "string3");
        mapOrder.put(4, "string4");
        mapOrder.put(5, "string5");
        mapOrder.put(6, "string6");
        mapOrder.put(1000, "string1000");
        mapOrder.put(8, "string8");
        mapOrder.put(9, "string9");
        mapOrder.put(7, "string7");

        System.out.println(mapOrder);   //порядок добавления сохраняется
    }
}
