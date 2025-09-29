class Student{
    String name, gender;
    int age, roll;

    Student(){
        System.out.println("This is defualt constructor");
    }

    Student(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    Student(String name, String gender, int age, int roll){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.roll = roll;
    }

    void show(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Roll: "+ roll);
}
}

public class OverloadingConst{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.show();

        Student student2 = new Student("Anisul Islam", "Male");
        student2.show();

        Student student3 = new Student("Zihad", "Male", 25, 52);
        student3.show();
    }
}