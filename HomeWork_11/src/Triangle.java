public class Triangle implements Shape{
    private double A;
    private double B;
    private double C;
    private String fillColor;
    private String borderColor;
    // Конструктор для треугольника
    public Triangle (double A, double B, double C, String fillColor, String borderColor) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы для треугольника
    @Override
    public double calculatePerimeter() {
        return A + B + C;
    }
    @Override
    public double calculateArea() {
        double S = calculatePerimeter() / 2;
        return Math.sqrt(S * (S - A) * (S - B) * (S - C));
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
