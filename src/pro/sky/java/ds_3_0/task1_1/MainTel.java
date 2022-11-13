package pro.sky.java.ds_3_0.task1_1;

public class MainTel {
    public static void main(String[] args) {

//        Map<PhoneBook, PhoneBook> phoneBook2 = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhone("Петр Иванов1", "8-464-843-6546-1");
        phoneBook.addPhone("Петр Иванов2", "8-464-843-6546-2");
        phoneBook.addPhone("Петр Иванов3", "8-464-843-6546-3");
        phoneBook.addPhone("Петр Иванов4", "8-464-843-6546-4");
        phoneBook.addPhone("Петр Иванов5", "8-464-843-6546-5");
        phoneBook.addPhone("Петр Иванов6", "8-464-843-6546-6");
        phoneBook.addPhone("Петр Иванов7", "8-464-843-6546-7");
        phoneBook.addPhone("Петр Иванов8", "8-464-843-6546-8");
        phoneBook.addPhone("Петр Иванов9", "8-464-843-6546-9");
        phoneBook.addPhone("Петр Иванов10", "8-464-843-6546-10");
        phoneBook.addPhone("Петр Иванов11", "8-464-843-6546-11");
        phoneBook.addPhone("Петр Иванов12", "8-464-843-6546-12");
        phoneBook.addPhone("Петр Иванов13", "8-464-843-6546-13");
        phoneBook.addPhone("Петр Иванов14", "8-464-843-6546-14");
        phoneBook.addPhone("Петр Иванов15", "8-464-843-6546-15");
        phoneBook.addPhone("Петр Иванов16", "8-464-843-6546-16");
        phoneBook.addPhone("Петр Иванов17", "8-464-843-6546-17");
        phoneBook.addPhone("Петр Иванов18", "8-464-843-6546-18");
        phoneBook.addPhone("Петр Иванов19", "8-464-843-6546-19");
        phoneBook.addPhone("Петр Иванов20", "8-464-843-6546-20");

        phoneBook.addPhone("Петр Иванов21", "8-464-843-6546-20 дубль только номера"); //добавился
        phoneBook.addPhone("Петр Иванов1", "8-464-843-6546-1 замена номера"); //перезапись номера
        phoneBook.addPhone("Петр Иванов2", "8-464-843-6546-2"); //полный дубль - не добавился

        System.out.println(phoneBook);
    }
}
