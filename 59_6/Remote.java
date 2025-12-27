public abstract class Remote{
    boolean switchedOn;
    abstract void upButton();
    abstract void downButton();
    void powerButton(){
        switchedOn = !switchedOn;
    }

    Remote(boolean switchedOn){
        this.switchedOn = switchedOn;
    }
}