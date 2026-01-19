class Dog extends Pet{
    // String name;
    Dog(String name){
        super(name);
        System.out.println(name + " constructor called");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
    void play(){
        System.out.println("Dog is playing");
    }
    void run(){
        System.out.println("Dog is running");
    }
}