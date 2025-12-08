public class Main{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 12);
        Triangle t = new Triangle(4, 6);

        System.out.println("Area of the Rectangle: " + r.getArea());
        System.out.println("Area of the Triangle: " + t.getArea());
    }
}