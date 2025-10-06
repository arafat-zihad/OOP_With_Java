// GFG; 1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".

class MessagePrinter{
    void printMessage(String name){
        System.out.println("Hello " + name);
    }
}

public class Main{
    public static void main(String[] args) {
        MessagePrinter obj = new MessagePrinter();
        obj.printMessage("Zihad");

    }
}