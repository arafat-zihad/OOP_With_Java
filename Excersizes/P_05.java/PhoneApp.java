

public class PhoneApp{
    public static void main(String[] args) {
        Phone p = new Phone("01711-123123");
        
        p.call("0138129482");

        SmartPhone sp = new SmartPhone(13);
        sp.selfie();
    }
}