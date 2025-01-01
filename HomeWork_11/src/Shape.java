/**Задание 2:
 Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур:
 круг, прямоугольник, треугольник.
 Задать для каждой фигуры цвет заливки и цвет границы.
 Результат полученных характеристик [Периметр, площадь, цвет фона, цвет границ]
 по каждой фигуре вывести в консоль.
 Попробуйте реализовать базовые методы, такие как расчет периметра фигур,
 в качестве дефолтных методов в интерфейсе.
 */
interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    // Метод вывода информации о фигуре в консоль
    default void printCharacteristics() {
        if (getClass().equals(Circle.class)) {
            System.out.println("Расчёт для круга");
        } else if (getClass().equals(Rectangle.class)) {
            System.out.println("Расчёт для прямоугольника");
        } else if (getClass().equals(Triangle.class)) {
            System.out.println("Расчёт для треугольника");
        }
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
