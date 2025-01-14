import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Написать простой класс Телефонный Справочник,
 * который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add()
 * можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class PhoneBook {
    private Map<String, List<String>> contacts;
    // Конструктор телефонной книги
    public PhoneBook() {
        contacts = new HashMap<>();
    }
    // Метод добавления номера
    public void add(String lastName, String phoneNumber) {
        if (!contacts.containsKey(lastName)) {
            contacts.put(lastName, new ArrayList<>());
        }
        contacts.get(lastName).add(phoneNumber);
    }
    // Метод поиска номера с ответом даже если номер не существует
    public String get(String lastName) {
        if (contacts.containsKey(lastName)) {
            return "Номер(а) телефонов для " + lastName + ": " + contacts.get(lastName);
        } else {
            return "Контакт " + lastName + " не найден.";
        }
    }
}
