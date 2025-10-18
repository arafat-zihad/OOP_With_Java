public class SmartPhone extends Phone{
    double camera;

    SmartPhone(double camera, String num) {
        super(num);
        this.camera = camera;
    }
    void selfie(){
        super.call("01393131");
        System.out.println(camera + "MP");
        System.out.println("Took Selfie");
    }

}