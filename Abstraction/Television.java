abstract class TV{
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends TV{
    @Override
    void turnOn(){
        System.out.println("TV is turnded ON.");
    }
    @Override
    void turnOff(){
        System.out.println("TV is turnded off");
    }
}

public class Television{
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}