class Employee{
    private int empId;
    private String empName;
    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    
    public String getInfo(){
        return empName;
    }

    public String getInfo(double salary){
        
        return empName + " " + salary;
    }
}

public class Main{
    public static void main(String[] args) {
        Employee obj = new Employee(101, "Monkey D. Luffy");
        obj.getInfo();
        obj.getInfo(2000.9);
    }

    
}