abstract class Animal{
    public abstract void sound();
}

class Lion extends Animal{

    public void sound(){
        System.out.println("Gaaaw");
    }
}

class Tiger extends Animal{

    public void sound(){
        System.out.println("Aaaaai");
    }
}

