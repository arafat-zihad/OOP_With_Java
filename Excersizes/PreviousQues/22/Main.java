public class Main{
    public static void main(String[] args) {
        Car obj1 = new Car("Tesla", 150, 2020);
        obj1.CarDetails();
        obj1.isFast();

        Car obj2 = new Car("Mazda", 120, 1990);
        obj2.CarDetails();
        obj2.isFast();
    }
}