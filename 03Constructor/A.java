public class A{
    int a, b;
    A(int x, int y){
        a = x;
        b = y;
        System.out.println("\nFirst value: " + x);
        System.out.println("\nLast value: " + b);
    }
    A(int x){
        b = x;
        System.out.println("\nNext: " + b);
    }
}