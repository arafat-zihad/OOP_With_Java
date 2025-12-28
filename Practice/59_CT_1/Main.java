public class Main{
    public static void main(String[] args) {
        Pet obj = new Dog("Tom");
        obj.eat();
        obj.play();
        obj.sleep();
        ((Dog)obj).run();

    }
}