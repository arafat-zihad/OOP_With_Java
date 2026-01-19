class Device{
    private String name;

    Device(String name){
        this.name = name;
    }
    public String getValue(){
        return name;
    }
    void printInfo(){
        System.out.println("Device: " + name);
    }
}