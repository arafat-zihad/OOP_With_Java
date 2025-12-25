public class Main{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(2, 3));
        obj.add(2, 3, 4);
        obj.add(2.0, 3.0);
    }
}