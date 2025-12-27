public class Main{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(2, 3));
        obj.add(2, 3, 4);
        obj.add(2.0, 3.0);
    }
}
class A{
    int x, y;
    A(int x, int y){ 
    this.x = x;
    this.y = y;
    }
class B extends A { 
    int z;
    B(int x, int y, int z) { 
        super(x, y); // Calls superclass 
        this.z =z;
     }
}