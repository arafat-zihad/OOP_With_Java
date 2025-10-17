class Student {
    String name; 
    int age;
    String major;

    Student(String name){
        this.name = name;
    }

    void Student(){
        name = "Unnamed";
        age = 18;
        major = "Undeclared";
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(int a){
        age = a;
    }

    Student() {

    }
    Student(String n, String m){
        major = m;
        name = n;
    }
    

}