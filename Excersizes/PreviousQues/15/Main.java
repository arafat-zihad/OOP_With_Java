public class Main{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.person_name = "Zihad";
        student1.id = 052;
        student1.showInfo();
        student1.study();

        Teacher teacher1 = new Teacher();
        teacher1.person_name = "Anware Khanom";
        teacher1.id = 01;
        teacher1.showInfo();
        teacher1.teach();
    }
}