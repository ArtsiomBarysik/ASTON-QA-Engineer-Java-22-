import java.awt.*;

class Triangle implements Shape {
    private int[] xPoints;
    private int[] yPoints; private Color fillColor;
    private Color borderColor;
    // Конструктор треугольника
    // Массив xPoint и yPoint это координаты вершин треугольника, по x и y координатам соответственно
    public Triangle(int[] xPoints, int[] yPoints, Color fillColor, Color borderColor) {
        if (xPoints.length != 3 || yPoints.length != 3) {
            throw new IllegalArgumentException("Triangle must have exactly 3 points.");
        }
        this.xPoints = xPoints;
        this.yPoints = yPoints;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Переопределенные методы треугольника
    @Override
    public double calculatePerimeter() {
        double sideA = Math.hypot(xPoints[1] - xPoints[0], yPoints[1] - yPoints[0]);
        double sideB = Math.hypot(xPoints[2] - xPoints[1], yPoints[2] - yPoints[1]);
        double sideC = Math.hypot(xPoints[2] - xPoints[0], yPoints[2] - yPoints[0]);
        return sideA + sideB + sideC;
    }
    @Override
    public double calculateArea() {
        return Math.abs((xPoints[0] * (yPoints[1] - yPoints[2]) + xPoints[1] * (yPoints[2] - yPoints[0]) + xPoints[2] * (yPoints[0] - yPoints[1])) / 2.0);
    }
    @Override
    public String getFillColor() {
        return ColorName.getColorName(fillColor);
    } @Override
    public String getBorderColor() {
        return ColorName.getColorName(borderColor);
    } @Override
    public void draw(Graphics g) {
        g.setColor(fillColor);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(borderColor);
        g.drawPolygon(xPoints, yPoints, 3);
    }
}