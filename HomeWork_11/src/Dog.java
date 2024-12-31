// Класс собаки
public class Dog extends Animal {
    private String color;
    private static int dogClassCount = 0;
    // Конструктор класса Dog
    public Dog (String name, String color) {
        super(name);
        this.color = color;
        dogClassCount++;
    }
    // Геттеры класса Dog
    public String getColor() {
        return color;
    }
    public static int getDogClassCount() {
        return dogClassCount;
    }
    // Сеттер класса Cat
    public void setColor(String color) {
        this.color = color;
    }
    // Метод бега Собаки
    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Ну что ты так, палку хоть кинь..");
        } else if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Попробуй сам столько пробежать!");
        }
    }
    // Метод плавания Собаки
    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("А Иисус умел по воде ходить.");
        } else if (distance <= 10) {
            System.out.println(getName()+ " проплыл " + distance + " метров.");
        } else {
            System.out.println("Ну мы же не на олимпиаде.");
        }
    }
}
