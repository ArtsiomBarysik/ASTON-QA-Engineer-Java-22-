// Класс прародитель животных
public class Animal {
    private String name;
    private static int animalClassCount = 0;
    private static int totalCount = 0;
    // Конструктор класса Animal
    public Animal(String name) {
        this.name = name;
        if (this.getClass() == Animal.class) {
            animalClassCount++;
        }
        totalCount++;
    }
    // Геттеры класса Animal
    public String getName() {
        return name;
    }
    public static int getAnimalClassCount() {
        return animalClassCount;
    }
    public static int getTotalCount() {
        return totalCount;
    }
    // Сеттер класса Animal
    public void setName(String name) {
        this.name = name;
    }
    // Базовый метод бега
    public void run (int distance) {
            System.out.println(this.name + " пробежал " + distance + " метров.");
        }
    // Базовый метод плавания
    public void swim (int distance) {
            System.out.println(this.name + " проплыл " + distance + " метров.");
        }
    }
