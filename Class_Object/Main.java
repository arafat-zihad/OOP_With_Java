
/* Create a Class called Teacher, then make 2 objects (teacher1, 
teacher2) from this class and print them.*/

class Teacher{
    String name;
    int age;
    String gender;
    int phone;

    void show(){
    System.out.println("Name: " + name);
    System.out.println("Age: "+ age);
    System.out.println("Gender: " + gender);
    System.out.println("Phone: " + phone);
    }
}

public class Main{ 
public static void main(String[] args){
    System.out.println("");
    //Without method
    Teacher teacher1 = new Teacher();
    teacher1.name = "Anisul Islam";
    teacher1.age = 28;
    teacher1.gender = "Male";
    teacher1.phone = 128382929;

    System.out.println(teacher1.name);
    System.out.println(teacher1.age);
    System.out.println(teacher1.gender);
    System.out.println(teacher1.phone);

System.out.println("");

    //Using method
    Teacher teacher2;
    teacher2 = new Teacher();

    teacher2.name = "Ruhul Amin";
    teacher2.age = 28;
    teacher2.gender = "Male";
    teacher2.phone = 10344242;

    teacher2.show();
}


}