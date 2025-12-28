class Laptop extends Device{
    private int price;
    Laptop(String name, int price){
        super(name);
        this.price = price;
    }
    void printInfo(){
        System.out.println("Laptop: " + getValue() + " Price: " + price);
    }
}