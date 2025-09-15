
class Teacher {

    String name;
    int age;
    String gender;
    int phone;

    void setInfo(String n, int a, String g, int ph) {
        name = n;
        age = a;
        gender = g;
        phone = ph;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }
}

public class Parametrised_Method {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Anisul Islam", 28, "Male", 12943244);
        teacher1.show();

        System.out.println("");

        Teacher teacher2 = new Teacher();
        teacher2.setInfo("Ruhul Amin", 30, "Male", 19434524);
        teacher2.show();
    }

}
