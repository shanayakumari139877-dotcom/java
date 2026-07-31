import java.util.Scanner;

public class ep_u1p2
{
    public static void main(String[] args) 
	{
         Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circle Calculations ===");
		
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circleArea = 3.14 * radius * radius;
        double circlePerimeter = 2 * 3.14 * radius;

        System.out.printf("Circle Area: %.2f\n", circleArea);
        System.out.printf("Circle Perimeter (Circumference): %.2f\n\n", circlePerimeter);
		
        System.out.println("=== Rectangle Calculations ===");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.printf("Rectangle Area: %.2f\n", rectangleArea);
        System.out.printf("Rectangle Perimeter: %.2f\n", rectanglePerimeter);

        scanner.close();
    }
}