import java.awt.*;

class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color fillColor;
    private Color borderColor;
    // Конструктор класса треугольник
    public Triangle(double sideA, double sideB, double sideC, Color fillColor, Color borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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
        int[] xPoints = {100, 150, 50};
        int[] yPoints = {300, 400, 400};
        g.setColor(fillColor);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(borderColor);
        g.drawPolygon(xPoints, yPoints, 3);
    }
}