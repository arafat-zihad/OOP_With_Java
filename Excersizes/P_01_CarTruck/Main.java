
public class Main{
    public static void main(String[] args) {
        Truck myTruck = new Truck("Toyota", 5000);
        Car anotherTruck = new Truck("Ford", 5000);

        Car myCar = (Car) myTruck;
        Car badTruck = (Truck) anotherTruck;

        ((Truck)anotherTruck).loadTruck();
        myCar.startEngine();
        myTruck.loadTruck();
        System.out.println("loadCapacity");
    }
}