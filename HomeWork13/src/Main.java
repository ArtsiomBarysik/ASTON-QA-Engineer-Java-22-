import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций).
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Желание","Семнадцать","Ржавый","Желание","Рассвет","Печь","Один","Девять","Семнадцать","Добросердечный","Возвращение на родину","Ржавый","Один","Товарный вагон","Товарный вагон" );
        // Поиск и вывод уникальных слов
        Set<String> unique = new LinkedHashSet<>(list);
        System.out.println("Уникальные слова: " + unique);
        // Поиск и вывод повторяющихся слов
        Map<String, Integer> count = new HashMap<>();
        for (String word : list) {
            count.put(word, count.getOrDefault(word, 0) +1);
        }
        System.out.println("Количество повторений:");
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Создаю телефонный справочник и заполняю
        PhoneBook book = new PhoneBook();
        book.add("Egorov", "+375448997732");
        book.add("Makanen","+375298917642");
        book.add("Makanen","+375339775482");
        book.add("Denisov","+375448226458");
        // Проверяю существующим и не существующим контактом
        System.out.println(book.get("Makanen"));
        System.out.println(book.get("Lapitsiy"));
    }
}