package pro.sky.java.ds_3_0.task1_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private final Map<String, String> phoneBook = new HashMap<>();

    public void addPhone(String fullName, String phone) {
        this.phoneBook.put(fullName, phone);
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook1 = (PhoneBook) o;
        return Objects.equals(phoneBook, phoneBook1.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneBook);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Телефонный справочник:").append('\n');
        int count = 1;
        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            stringBuilder.append(count).append(" Контакт ").append(contact.getKey()).append(": ").append(contact.getValue()).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
