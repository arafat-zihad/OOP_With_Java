public class Main{
    public static void main(String[] args) {
        Circle obj1 = new Circle(2);
        Rectangle obj2 = new Rectangle(2, 3);

        obj1.color = "Green";
        obj1.displayColor();
        obj1.area();

        obj2.color = "Red";
        obj2.displayColor(); 
        obj2.area();
    }
}