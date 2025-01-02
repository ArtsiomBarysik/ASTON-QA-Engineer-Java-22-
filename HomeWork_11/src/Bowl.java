// Класс миски
public class Bowl {
    private int foodAmount;
    // Конструктор класса Bowl
    public Bowl (int foodAmount) {
        this.foodAmount = foodAmount;
    }
    // Геттер класса Bowl
    public int getFoodAmount () {
        return foodAmount;
    }
    // Сеттер класса Bowl
    public void setFoodAmount (int foodAmount) {
        this.foodAmount = foodAmount;
    }
    // Метод добавления еды
    public void addFood (int amount) {
        if (amount <=0) {
            System.out.println("Некорректное значение");
        } else {
            foodAmount += amount;
            System.out.println("В миску добавили " + amount + " единиц еды, теперь в ней " + foodAmount + " единиц еды");
        }
    }
    // Метод уменьшения еды в миске
    public void consumeFood (int food) {
            foodAmount = foodAmount - food;
    }
    // Метод проверки кол-ва еды
    public void checkFood () {
        System.out.println("В миске " + foodAmount + " единиц еды");
    }
}
