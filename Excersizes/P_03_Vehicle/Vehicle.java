class Vehicle{
    static String model; 
    
    Vehicle(String model){
        Vehicle.model = model; // corrected
    }

    static void showModel(){ //Corrected
        System.out.println("Model: " + model);
    }
}