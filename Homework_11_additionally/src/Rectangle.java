import java.awt.*;

class Rectangle implements Shape {
    private double length;
    private double width;
    private Color fillColor;
    private Color borderColor;
    // Конструктор класса Прямоугольник
    public Rectangle(double length, double width, Color fillColor, Color borderColor) {
        this.length = length;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы
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
        return ColorName.getColorName(fillColor);
    }
    @Override
    public String getBorderColor() {
        return ColorName.getColorName(borderColor);
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(fillColor);
        g.fillRect(50, 200, (int) length, (int) width);
        g.setColor(borderColor);
        g.drawRect(50, 200, (int) length, (int) width);
    }
}
