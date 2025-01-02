import java.awt.*;

interface Shape {
    double calculatePerimeter();
    double calculateArea();
    String getFillColor();
    String getBorderColor();
    void draw(Graphics g);
    default void printCharacteristics() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}
enum ColorName {
    RED(Color.RED, "Red"),
    BLACK(Color.BLACK, "Black"),
    GREEN(Color.GREEN, "Green"),
    BLUE(Color.BLUE, "Blue"),
    YELLOW(Color.YELLOW, "Yellow"),
    MAGENTA(Color.MAGENTA, "Magenta");
    private final Color color;
    private final String name;
    ColorName(Color color, String name) {
        this.color = color;
        this.name = name;
    }
    public Color getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public static String getColorName(Color color) {
        for (ColorName colorName : values()) {
            if (colorName.getColor().equals(color)) {
                return colorName.getName();
            }
        }
        return "Unknown";
    }
}