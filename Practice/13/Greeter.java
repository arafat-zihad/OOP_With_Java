public class Greeter{
    public void greet(){
        System.out.println("Hi");
    }
    
    public void greet(String name){
        System.out.println("How are you " + name);
    }

    public void greet(String name, int age){
        System.out.println(name + " are you " + age +"?");
    }
}