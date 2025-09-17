class Teacher{
    String name;
    int age;
    String gender;
    int phone;


    void setinfo(String n,int a, String m, int ph){
        name = n;
        age = a;
        gender = m;
        phone = ph;
    }
    void show(){
    System.out.println("Name: " + name);
    System.out.println("Age: "+ age);
    System.out.println("Gender: " + gender);
    System.out.println("Phone: " + phone);
    }
}

public class Method_paramiterised{ 
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

    //Parameterised method
    teacher2.setinfo("Ruhul Amin", 30, "Male", 13423842);

    teacher2.show();
}


}