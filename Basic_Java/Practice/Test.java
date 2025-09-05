class Teacher{
    String name;
    int age;
    String gender;
    int phone;
}

public class Test{ 
public static void main(String[] args){
    Teacher teacher1 = new Teacher();
    teacher1.name = "Anisul Islam";
    teacher1.age = 28;
    teacher1.gender = "Male";
    teacher1.phone = 128382929;

    System.out.println(teacher1.name);
    System.out.println(teacher1.age);
    System.out.println(teacher1.gender);
    System.out.println(teacher1.phone);
}

}