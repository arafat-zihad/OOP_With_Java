public class Car{
    String model_name;
    double speed;
    int year;

    public Car(String model, double speed, int year) {
        model_name = model;
        this.speed = speed;
        this.year = year;
    }

    void display(){
        System.out.println("Model: " + model_name);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
    }
}