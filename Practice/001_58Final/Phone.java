public class Phone{
    int battery;
    /*Error 1*/Phone(int battery){
        this.battery = battery;
    }
    void call(){
        System.out.println(battery + "mAh");
        System.out.println("Calling");
    }
}