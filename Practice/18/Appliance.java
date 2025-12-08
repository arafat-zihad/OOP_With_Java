abstract class Appliance{
    String brand;
    boolean isOn;

    public Appliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    


    abstract void operate();

    void powerSwitch(){
        isOn = !isOn;
        if(isOn){
            System.out.println("On");
        } else{
            System.out.println("OFF");

        }
    }
}