abstract class Car {
    abstract public void fueltype();
    public void color(){
        System.out.println("Black color");
    }
}

class Tesla extends Car {
    public void fueltype(){
        System.out.println("Diesel");
    }
}


public class Main{
    public static void main(String[] args) {
        Tesla Model1 = new Tesla();
        Model1.fueltype();
        Model1.color();
    }
}