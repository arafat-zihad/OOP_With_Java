class Employee{
    String name;
    int age;
    String department;

    Employee(String name){
        this.name = name;
    }

    void Employee(String name){ 
        this.name = name;
        age = 22;
        department = "Sales";
    } 

    //Added a method for e1.Employee;
    void Employee(){ 
        this.name = name;
        age = 22;
        department = "Sales";
    } 
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    Employee(int a){ // corrected
        // this.name = n;
        this.age = a;
    }

    // add new consturctr for e4public //added new constructor for e5
    Employee() {

    }

    //added new constructor for e5
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    

}