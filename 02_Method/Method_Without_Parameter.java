class Teacher {
   String name;
   int age;
   String gender;
   int phone;

   void show() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Gender: " + gender);
       System.out.println("Phone: " + phone);
   }
}


public class Method_Without_Parameter {
   public static void main(String[] args) {
      
       Teacher teacher1 = new Teacher();
       teacher1.name = "Anisul Islam";
       teacher1.age = 28;
       teacher1.gender = "Male";
       teacher1.phone = 128382929;


       teacher1.show();


       System.out.println("");


       Teacher teacher2;
       teacher2 = new Teacher();


       teacher2.name = "Ruhul Amin";
       teacher2.age = 30;
       teacher2.gender = "Male";
       teacher2.phone = 10344242;


       teacher2.show();
   }


}
