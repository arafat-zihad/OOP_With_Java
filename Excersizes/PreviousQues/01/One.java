public class One{
    // String name;
    void printMessage(String name){
        // this.name = name;
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        One obj = new One();
        obj.printMessage("Zihad");
    }
}