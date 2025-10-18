class Car extends Vehicle{
    int engine;
    Car(String model,  int engine){
        super(model); // corrected
        this.engine = engine; // corrected
    }

    void showModel(){
        System.out.println("Model: " + model); // use instance field, not Vehicle.model
    }
}

