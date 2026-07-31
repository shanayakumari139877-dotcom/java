import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // --- CIRCLE CALCULATIONS ---
        System.out.println("=== Circle Calculations ===");
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Formulas: Area = 𝝿 * r², Perimeter (Circumference) = 2 * 𝝿 * r
        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.printf("Circle Area: %.2f\n", circleArea);
        System.out.printf("Circle Perimeter (Circumference): %.2f\n\n", circlePerimeter);


        // --- RECTANGLE CALCULATIONS ---
        System.out.println("=== Rectangle Calculations ===");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Formulas: Area = length * width, Perimeter = 2 * (length + width)
        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.printf("Rectangle Area: %.2f\n", rectangleArea);
        System.out.printf("Rectangle Perimeter: %.2f\n", rectanglePerimeter);

        // Close the scanner resource
        scanner.close();
    }
}