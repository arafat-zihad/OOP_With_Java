class Teacher{
    String name;
    int age;
    String gender;
    int phone;

    //Constructor
    Teacher(String n, int a, String g, int ph) {
        name = n;
        age = a;
        gender = g;
        phone = ph;
    }

    void show(){        
        System.out.println("\n");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Phone = " + phone);
    }

}

public class Main{
    public static void main(String[] args) {
        //Object 1
        Teacher teacher1 = new Teacher("Anisul Islma", 28, "Male", 8325242);
        teacher1.show();

        //Object 2
        Teacher teacher2 = new Teacher("Ruhul Amin", 30, "Male", 349242425);
        teacher2.show();

    }
}