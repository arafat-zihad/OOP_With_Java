class Truck extends Car {
    int loadCapacity;

    Truck(String b, int capacity){
        super(b);
        loadCapacity = capacity;
    }

    void loadTruck(){
        System.out.println("Truck loaded with capacity " + loadCapacity);
    }
}
