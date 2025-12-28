abstract class Appliance {
    String brand;
    boolean isOn;

    Appliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    abstract void operate();

    void powerSwitch() {
        isOn = !isOn; 
        if (isOn) {
            System.out.println(brand + " is now ON");
        } else {
            System.out.println(brand + " is now OFF");
        }
    }
}

class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        if (isOn) {
            System.out.println("Washing clothes...");
        } else {
            System.out.println("Cannot operate. " + brand + " is OFF.");
        }
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        if (isOn) {
            System.out.println("Cooling food...");
        } else {
            System.out.println("Cannot operate. " + brand + " is OFF.");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG WashingMachine");
        wm.powerSwitch(); 
        wm.operate();
        wm.powerSwitch();
        wm.operate();

        System.out.println();

        Refrigerator fridge = new Refrigerator("Samsung Refrigerator");
        fridge.powerSwitch(); 
        fridge.operate();
        fridge.powerSwitch(); 
        fridge.operate();
    }
}
