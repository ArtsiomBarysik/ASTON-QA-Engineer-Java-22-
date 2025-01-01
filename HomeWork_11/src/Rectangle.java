public class Rectangle implements Shape{
    private double length;
    private double width;
    private String fillColor;
    private String borderColor;
    // Конструктор прямоугольника
    public Rectangle (double length, double width, String fillColor, String borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы для прямоугольника
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public String getFillColor() {
        return fillColor;
    }
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
