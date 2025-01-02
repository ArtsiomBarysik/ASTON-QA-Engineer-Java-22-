import java.awt.*;

class Circle implements Shape {
    private double radius;
    private Color fillColor;
    private Color borderColor;
    // Конструктор класса круг
    public Circle(double radius, Color fillColor, Color borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
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
        g.fillOval(50, 50, (int) radius * 2, (int) radius * 2);
        g.setColor(borderColor);
        g.drawOval(50, 50, (int) radius * 2, (int) radius * 2);
    }
}
