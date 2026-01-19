interface Car {
    public void start();
}

class ElectricCar implements Car {
    public void start(){
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car {
    public void start(){
        System.out.println("Diesel Car Starts");
    }
}

public class Main{
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car BMW = new DieselCar();
        Tesla.start();
        BMW.start();
    }
}