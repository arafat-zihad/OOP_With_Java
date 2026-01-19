class Employee{
    String name;
    int id;
    String depertment;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int it, String department) {
        this.name =name;
        this.id = id;
        this.depertment = department;
    }

    void displayDetails(){
        System.out.println("Name: "+ name);
        if(id != 0){
            System.out.println("ID: " + id);
        }
        if(depertment != null){
            System.out.println("Departmetn: " + depertment);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Zihad");
        emp1.displayDetails();

        Employee emp2 = new Employee("Islam", 111);
        emp2.displayDetails();

        Employee emp3 = new Employee("Aafat", 052, "CSE");
        emp3.displayDetails();
    }
    

    
}

