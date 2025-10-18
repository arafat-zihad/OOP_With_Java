class Vehicle{
    String model; 
    
    Vehicle(String model){
        this.model = model; // corrected
    }

    void showModel(){ // Corrected (removed static bcoz String model is not satic)
        System.out.println("Model: " + model);
    }
}