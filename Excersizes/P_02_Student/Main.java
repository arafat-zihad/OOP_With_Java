

public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Alice");
        Student s2 = new Student(21);
        Student s3 = new Student("Bob", 22);
        Student s4 = new Student();

        s1.Student();
        s2.Student();
        Student s5 = new Student("David", "Math");
        Student s6 = new Student("Eve", 20);
        System.out.println(s1.name);
    }
}