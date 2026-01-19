interface Animal{
    void makesound();
}
class Dog implements Animal{
    public void makesound(){
        System.out.println("Woof");
    }
}

class Cat implements Animal{
    public void makesound(){
        System.out.println("Meow");
    }
}

class Lion implements Animal{
    public void makesound(){
        System.out.println("Rour");
    }
}

public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.makesound();
        c.makesound();
        l.makesound();
    }
}