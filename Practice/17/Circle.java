public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    void  area(){
        
        System.out.println("Circle Area: " + Math.PI * (radius * radius));
    }
}