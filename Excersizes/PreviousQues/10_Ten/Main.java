public class Main{
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Zihad");
        obj.setAge(22);
        obj.setCountry("Bongoland");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getCountry());
    }
}