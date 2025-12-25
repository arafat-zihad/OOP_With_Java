public class SmartPhone extends Phone{
    double camera;
    SmartPhone(double camera, int battery){
        super(battery);
        this.camera = camera;
    }
    void selfie(){
        super.call();
        System.out.println(camera + "MP");
        System.out.println("Taking selfie");
    }
}