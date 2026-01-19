public class Rectangle extends Shape{
    double length; 
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    void area(){
        System.out.println("Rectangle Area: " + length * width );
    }

}