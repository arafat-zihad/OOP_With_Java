abstract class Pet{
    String name;
    Pet(String name){
        this.name = name;
        System.out.println("Pet constructor called");
    }

    abstract void play();
    void eat(){ //error 1
        System.out.println("Pet is eating");
    }
    void sleep(){
        System.out.println("Pet is sleeping");
    }

}