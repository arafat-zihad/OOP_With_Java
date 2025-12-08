abstract class Shape{
    String color;
    abstract void area();

    void displayColor(){
        System.out.println("Color: " + color);
    }
}