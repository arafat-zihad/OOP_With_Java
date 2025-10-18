class Car extends Vehicle{
    int engine;
    Car(String model,  int engine){
        super(model); // corrected
        this.engine = engine; // corrected
    }

    static void showModel(){
        System.out.println("Model: " + model); // corrected
    }
}

