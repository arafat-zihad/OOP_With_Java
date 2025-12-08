public class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Declare and initialize the radius for the circle
        double r = 4.0;
        // Create an instance of Circle with the specified radius
        Circle circle = new Circle(r);
        
        // Declare and initialize the sides for the triangle
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        // Create an instance of Triangle with the specified sides
        Triangle triangle = new Triangle(ts1, ts2, ts3);
        
        // Print the radius of the circle
        System.out.println("Radius of the Circle: " + r);
        // Print the area of the circle by calling the calculateArea method
        System.out.println("Area of the Circle: " + circle.calculateArea());
        // Print the perimeter of the circle by calling the calculatePerimeter method
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
        
        // Print the sides of the triangle
        System.out.println("\nSides of the Triangle are: " + ts1 + ',' + ts2 + ',' + ts3);
        // Print the area of the triangle by calling the calculateArea method
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        // Print the perimeter of the triangle by calling the calculatePerimeter method
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}