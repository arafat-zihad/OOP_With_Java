abstract class Appliance{
    String brand;
    boolean isOn;

    public Appliance(String brand, boolean isOn) {
        this.brand = brand;
        this.isOn = isOn;
    }

    abstract void operate();

    void powerSwitch(){
        if(isOn){
            System.out.println("On");
        } else{
            System.out.println("OFF");
        }
    }
}