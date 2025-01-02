import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
            Shape circle = new Circle(50, Color.RED, Color.BLACK);
            Shape rectangle = new Rectangle(100, 50, Color.GREEN, Color.BLUE);
            Shape triangle = new Triangle(new int[]{100, 150, 50}, new int[]{300, 400, 400}, Color.YELLOW, Color.MAGENTA);

            Shape[] shapes = {circle, rectangle, triangle};

            JFrame frame = new JFrame("Drawing Shapes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 500);
            frame.add(new DrawingPanel(shapes));
            frame.setVisible(true);

            for (Shape shape : shapes) {
                System.out.println(shape.getClass().getSimpleName() + ":");
                shape.printCharacteristics();
                System.out.println();
            }
        }
    }
