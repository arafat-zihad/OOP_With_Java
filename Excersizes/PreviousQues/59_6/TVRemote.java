public class TVRemote extends Remote{
    double time;
    public TVRemote(boolean switchedOn, double time){
        super(switchedOn);
        this.time = time;

    }
    void upButton(){
        System.out.println("Pressed up button for " + time + "second");
    }
    void downButton(){

    }
    void powerButton(){
        System.out.println("Pressed power button.");
    }
}