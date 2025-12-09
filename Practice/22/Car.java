public class Car{
    
    String model_name;
    double speed;
    int year;

    public Car(String model_name, double speed, int year) {
        this.model_name = model_name;
        this.speed = speed;
        this.year = year;
    }

    void CarDetails(){
        System.out.println("Model: " + model_name);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
    }

    void isFast(){
        if(speed > 150){
            System.out.println("Car is Fast");
        } 
        else{
            System.out.println("Car is not fast");
        }
    }

    // boolean isFast(){
    //     return speed > 150;
    // }


    
}