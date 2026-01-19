class Car{
    String brand;
    Car(String b){
        brand = b;
    }
    void startEngine(){
        System.out.println("Engine started for car: " + brand);
    }
}

class Truck extends Car{
    int loadCapacity;
    Truck(String b, int capacity){
        super(b);
        loadCapacity = capacity;
    }
    void loadTruck(){
        System.out.println("Truck loaded with capacity: " + loadCapacity + "Kg");
    }
}

public class Main{
    public static void main(String[] args) {
        Car c = new Car("Tesla");
        Truck t = new Truck("Velvo", 5000);
        t.loadTruck();
        c.startEngine();
    }
}